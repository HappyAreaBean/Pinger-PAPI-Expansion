
# ⚠ Please read this before download/using it. ⚠ 
This version only fixes the motd problem and uses another API to achieve this goal.

In original pinger the `motd` placeholder only getting the motd from `server.properties`.

If you don’t need this feature or the original version is enough for you to use, you don’t need to switch to this version.

Let me first declare that I did not say that the API used in this version is better than the original.
* I may add some feature as requested but I **do not guarantee** that I will add them. 
  * (In most cases, if it takes **little time to add that feature**, I **might** consider adding)
  * Of course, all the features idea not related to ServerPinger will be rejected.

And also this version of pinger is used privately on my own server, now is publicly available for everyone.

---

# ServerPinger
**Expansion that allows you to ping servers for information**

**[Wiki](https://github.com/HappyAreaBean/Pinger-PAPI-Expansion/wiki)** - **[Changelog](https://github.com/HappyAreaBean/Pinger-PAPI-Expansion/wiki/Changelog)**

---

Lets you ping a server through an IP or domain (with port), to check the online-status and to receive some information.
The placeholders have a "warmup" time of around one or two minutes after installing the expansion.

**Note:** These placeholders have a separate update-delay in the config.yml of PlaceholderAPI

Replace `mycoolserver.com:25565` with your own server/IP.

---

# Placeholders List:
```
%pinger_motd_mycoolserver.com:25565%
%pinger_players_mycoolserver.com:25565%
%pinger_max_mycoolserver.com:25565%
%pinger_pingversion_mycoolserver.com:25565%
%pinger_gameversion_mycoolserver.com:25565%
%pinger_online_mycoolserver.com:25565%
%pinger_booleanonline_mycoolserver.com:25565%
%pinger_isonlineplayers_mycoolserver.com:25565%
```

---

# How to install
1. Put/Replace `Expansion-Pinger.jar` to the folder `plugins\PlaceholderAPI\expansions`
2. /papi reload

---

### Information about the old version (Status)
* Because the name of the expansion was misleading and confused people about what this expansion does, so now it was renamed to `ServerPinger`
  * Also for better compatibility with the original pinger, so now the identifier is changed to `pinger`.

* Starting from version `v2.0`, you only need to use `status` as the placeholder identifier and you don't need to download the two versions separately 
  * **Note:** The expansion name in v2.0 is still called `Status`, please consider to update to the latest version asap
  * All the old version may clean up later.
