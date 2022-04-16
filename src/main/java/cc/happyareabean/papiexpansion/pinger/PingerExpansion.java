package cc.happyareabean.papiexpansion.pinger;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.Cacheable;
import me.clip.placeholderapi.expansion.Configurable;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.clip.placeholderapi.expansion.Taskable;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.net.InetSocketAddress;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PingerExpansion extends PlaceholderExpansion implements Cacheable, Taskable, Configurable
{
    private BukkitTask pingTask;
    private String online;
    private String offline;
    private String dynamic_online;
    private String dynamic_offline;
    private final Map<String, Pinger> servers;
    private final Map<String, InetSocketAddress> toPing;
    private int interval;
    private static PingerExpansion instance;

    public PingerExpansion() {
        this.pingTask = null;
        this.online = "&aOnline";
        this.offline = "&cOffline";
        this.dynamic_online = "&e<onlineplayers> playing";
        this.dynamic_offline = "&c&lOFFLINE";
        this.servers = new ConcurrentHashMap<>();
        this.toPing = new ConcurrentHashMap<>();
        this.interval = 60;
    }

    public Map<String, Object> getDefaults() {
        final LinkedHashMap<String, Object> defaults = new LinkedHashMap<String, Object>();
        final LinkedHashMap<String, Object> dynamicConfig = new LinkedHashMap<String, Object>();
        final LinkedHashMap<String, Object> customDynamicConfig = new LinkedHashMap<String, Object>();
        final LinkedHashMap<String, Object> customDynamicConfigContent = new LinkedHashMap<String, Object>();


        defaults.put("check_interval", 30);
        defaults.put("online", "&aOnline");
        defaults.put("offline", "&cOffline");

        defaults.put("dynamic", dynamicConfig);

        dynamicConfig.put("online", "&e<onlineplayers> playing");
        dynamicConfig.put("offline", "&c&lOFFLINE");

        dynamicConfig.put("custom", customDynamicConfig);

        customDynamicConfig.put("example", customDynamicConfigContent);

        customDynamicConfigContent.put("online", "&6&l<onlineplayers>/<max> &eplaying");
        customDynamicConfigContent.put("offline", "&c&l[ OFFLINE ]");

        return defaults;
    }

    public void start() {

        this.getConfigSection("dynamic.custom").getKeys(false).forEach((type) -> {
            String path = "dynamic.custom." + type + ".";
            String online = this.getString(path + "online", null);
            String offline = this.getString(path + "offline", null);

            CustomDynamic.getDynamicMap().put(type, new CustomDynamic(type, online, offline));
        });

        PingerExpansion.instance = this;

        this.online = this.getString("online", "&aOnline");
        this.offline = this.getString("offline", "&cOffline");

        this.dynamic_online = this.getString("dynamic.online", "&e<onlineplayers> playing");
        this.dynamic_offline = this.getString("dynamic.offline", "&c&lOFFLINE");

        final int time = this.getInt("check_interval", 60);
        if (time > 0) {
            this.interval = time;
        }

        this.pingTask = new BukkitRunnable() {
            public void run() {
                if (PingerExpansion.this.toPing.isEmpty()) return;
                for (final Map.Entry<String, InetSocketAddress> address : PingerExpansion.this.toPing.entrySet()) {
                    Pinger pinger;
                    try {
                        pinger = new Pinger(address.getValue().getHostName(), address.getValue().getPort());
                        if (pinger.fetchData()) {
                            PingerExpansion.this.servers.put(address.getKey(), pinger);
                        }
                        else {
                            if (!PingerExpansion.this.servers.containsKey(address.getKey())) {
                                continue;
                            }
                            PingerExpansion.this.servers.remove(address.getKey());
                        }
                    }
                    catch (Exception ignored) {}
                }
            }
        }.runTaskTimerAsynchronously(this.getPlaceholderAPI(), 0, 20L * this.interval);
    }

    public void stop() {
        try {
            this.pingTask.cancel();
        }
        catch (Exception ignored) {}
        this.pingTask = null;
    }

    public void clear() {
        this.servers.clear();
        this.toPing.clear();
        CustomDynamic.getDynamicMap().clear();
    }

    public String onPlaceholderRequest(final Player p, final String identifier) {
        final int place = identifier.indexOf("_");
        if (place == -1) {
            return null;
        }
        final String type = identifier.substring(0, place);
        final String address = identifier.substring(place + 1);
        Pinger pinger = null;
        if (type.equalsIgnoreCase("dynamic")) {

            /* For example the identifier is "dynamic_custom:example_127.0.0.1:25565"
             * What we do here is split it to 3 part for more easily work later
             * So after this will show like this
             *
             *   dynamic    custom:example   127.0.0.1:25565
             * 1 (index 0)   2 (index 1)      3 (index 2)
             *
             */
            String[] split = identifier.split("_");

            /*
             * Check if the split length is 3
             * this will make sure the identifier have custom:xxx
             */
            if (split.length == 3) {

                /*
                 * We used try catch block to catch any exception and return to null
                 */
                try {

                    /* We were getting the "custom" here.
                     * so we substring at 0 and getting the first ":" index in our split 1 (custom:example) and set it to the end-index
                     * so after that this will be look like: "custom"
                     */
                    String dynamicTypeIdentifier = split[1].substring(0, split[1].indexOf(":"));

                    /*
                     * Check if dynamic type identifier have "custom"
                     * Although we checked if the split length is 3 above
                     * But we still need to make sure is had all required thing to make it work
                     */
                    if (!dynamicTypeIdentifier.equalsIgnoreCase("custom"))
                        return null;

                    /* We were getting the dynamic type key here.
                     * so we're getting the first ":" index in our split 1 (custom:example) and add 1 to remove useless char
                     * because it won't remove the ":" based on how substring index work.
                     * so after that this will be look like: "example"
                     */
                    String dynamicType = split[1].substring(split[1].indexOf(":") + 1);

                    /* After we're getting the dynamic type key we need to find the address at the placeholder end
                     * But this is simple, because we split the identifier to three parts,
                     * and we get the split index 2, We will have the address.
                     */
                    String dynamicAddress = split[2];

                    for (final String a : this.servers.keySet()) {
                        if (a.equalsIgnoreCase(dynamicAddress)) {
                            pinger = this.servers.get(a);
                            break;
                        }
                    }
                    addToPing(pinger, dynamicAddress);

                    if (CustomDynamic.getDynamicMap().containsKey(dynamicType)) {
                        CustomDynamic dynamicMaps = CustomDynamic.getDynamicMap().get(dynamicType);
                        return (pinger != null) ? PlaceholderAPI.setPlaceholders(p, dynamicMaps.getOnline().replaceAll("<onlineplayers>", String.valueOf(pinger.getPlayersOnline()))
                                .replaceAll("<max>", String.valueOf(pinger.getMaxPlayers()))
                                .replaceAll("<motd>", pinger.getMotd())
                                .replaceAll("<version>", pinger.getGameVersion())
                                .replaceAll("<protocol>", String.valueOf(pinger.getProtocolVersion()))
                                .replaceAll("<online>", this.online)) : dynamicMaps.getOffline().replaceAll("<offline>", this.offline);
                    } else {
                        return null;
                    }
                } catch (Throwable ex) {
                    ex.printStackTrace();
                    return null;
                }
            } else {
                for (final String a : this.servers.keySet()) {
                    if (a.equalsIgnoreCase(address)) {
                        pinger = this.servers.get(a);
                        break;
                    }
                }
                addToPing(pinger, address);
                return (pinger != null) ? PlaceholderAPI.setPlaceholders(p, this.dynamic_online.replaceAll("<onlineplayers>", String.valueOf(pinger.getPlayersOnline()))
                        .replaceAll("<max>", String.valueOf(pinger.getMaxPlayers()))
                        .replaceAll("<motd>", pinger.getMotd())
                        .replaceAll("<version>", pinger.getGameVersion())
                        .replaceAll("<protocol>", String.valueOf(pinger.getProtocolVersion()))
                        .replaceAll("<online>", this.online)) : this.dynamic_offline.replaceAll("<offline>", this.offline);
            }
        }
        for (final String serverAddress : this.servers.keySet()) {
            if (serverAddress.equalsIgnoreCase(address)) {
                pinger = this.servers.get(serverAddress);
                break;
            }
        }
        addToPing(pinger, address);
        if (type.equalsIgnoreCase("motd")) {
            return (pinger != null) ? pinger.getMotd() : this.offline;
        }
        if (type.equalsIgnoreCase("count") || type.equalsIgnoreCase("players")) {
            return (pinger != null) ? String.valueOf(pinger.getPlayersOnline()) : "0";
        }
        if (type.equalsIgnoreCase("max") || type.equalsIgnoreCase("maxplayers")) {
            return (pinger != null) ? String.valueOf(pinger.getMaxPlayers()) : "0";
        }
        if (type.equalsIgnoreCase("pingversion") || type.equalsIgnoreCase("pingv")) {
            return (pinger != null) ? String.valueOf(pinger.getPingVersion()) : "-1";
        }
        if (type.equalsIgnoreCase("gameversion") || type.equalsIgnoreCase("version")) {
            return (pinger != null && pinger.getGameVersion() != null) ? String.valueOf(pinger.getGameVersion()) : "";
        }
        if (type.equalsIgnoreCase("online") || type.equalsIgnoreCase("isonline")) {
            return (pinger != null) ? this.online : this.offline;
        }
        if (type.equalsIgnoreCase("booleanonline")) {
            return (pinger != null) ? "true" : "false";
        }
        return null;
    }

    @Override
    public boolean canRegister() {
        return true;
    }

    @Override
    public String getAuthor() {
        return "HappyAreaBean";
    }

    @Override
    public String getIdentifier() {
        return "serverpinger";
    }

    @Override
    public String getVersion() {
        return "2.2";
    }

    public static PingerExpansion getInstance() {
        return instance;
    }

    public void addToPing(Pinger pinger, String address) {
        if (pinger == null && !this.toPing.containsKey(address)) {
            int port = 25565;
            String add = address;
            if (address.contains(":")) {
                add = address.substring(0, address.indexOf(":"));
                try {
                    port = Integer.parseInt(address.substring(address.indexOf(":") + 1));
                }
                catch (Exception ex) {}
            }
            this.toPing.put(address, new InetSocketAddress(add, port));
        }
    }
}
