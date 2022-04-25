
# What is ServerPinger?

ServerPinger used another API to fixes the motd problem and came with some new [features](#features).

In original pinger expansion the `motd` placeholder only getting the motd from `server.properties`.

If you don’t need any of these feature or the original version is enough for you to use, you don’t need to switch to/use this version.

**Still not sure? Recommend you read the [features](#features) list first.**

Feedback / Suggestions always welcome! ❤

* I may add some feature as requested, but I **do not guarantee** that I will add them.
    * (In most cases, if it takes **little time to add that feature** ~~(and within my abilities)~~, I **might** consider adding)
    * Of course, all the features' idea not related to ServerPinger will be rejected.

---

# ServerPinger

[![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/HappyAreaBean/ServerPinger-PAPI-Expansion?label=latest%20stable&style=for-the-badge)](https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/releases) [![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/HappyAreaBean/ServerPinger-PAPI-Expansion?include_prereleases&label=latest%20beta&style=for-the-badge)](https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/releases) [![GitHub release (latest by date)](https://img.shields.io/github/downloads/HappyAreaBean/ServerPinger-PAPI-Expansion/latest/total?label=Downloads%40Latest&style=for-the-badge)](https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/releases)

**PlaceholderAPI Expansion that allows you to ping servers for information**

**Required [PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/) plugin to work.** (Of course, you need it)

**[Wiki](https://happyareabean.gitbook.io/bean-docs/plugins/serverpinger)** - **[Configuration](https://happyareabean.gitbook.io/bean-docs/plugins/serverpinger/configuration)** - **[Changelog](https://happyareabean.gitbook.io/bean-docs/plugins/serverpinger/changelog)** - **[Releases](https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/releases)**

<a href="https://go.happyareabean.cc/supportdiscord"><img src="https://images.levats.com/join_us_on_discord.png" alt="drawing" width="300"/></a>

---

# Features
Lets you ping a server through an IP or domain (with port), to check the online-status and to receive some information.
The placeholders have a "warmup" time of around one or two minutes after installing the expansion.
* MOTD Support
* Dynamic online message
* Boolean online
* [Custom Dynamic](https://happyareabean.gitbook.io/bean-docs/plugins/serverpinger/custom-dynamic) (Added in v2.1+)

---

# Placeholders List
**Note:** These placeholders have a separate update-delay in the config.yml of PlaceholderAPI

Replace `mycoolserver.com:25565` with your own server/IP.
```
%serverpinger_motd_mycoolserver.com:25565%
%serverpinger_players_mycoolserver.com:25565%
%serverpinger_max_mycoolserver.com:25565%
%serverpinger_pingversion_mycoolserver.com:25565%
%serverpinger_gameversion_mycoolserver.com:25565%
%serverpinger_online_mycoolserver.com:25565%
%serverpinger_booleanonline_mycoolserver.com:25565%
%serverpinger_dynamic_mycoolserver.com:25565%
%serverpinger_dynamic_custom:example_mycoolserver.com:25565%
```

---

# How to install
1. Put `Expansion-ServerPinger.jar` to the folder `plugins\PlaceholderAPI\expansions`
2. /papi reload

---

# Credits

* Original [Pinger](https://github.com/PlaceholderAPI/Pinger-Expansion) expansion
