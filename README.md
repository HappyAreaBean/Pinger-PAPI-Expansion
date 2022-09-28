
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

[![GitHub release][latest-release]][github-release-url] 
[![GitHub pre release][latest-pre-release]][github-release-url]
[![GitHub downloads][downloads]][github-release-url]
[![Issues][issues-shield]][issues-url]
[![Discord][discord-shield]][discord-url]

**PlaceholderAPI Expansion that allows you to ping servers for information**

**Required [PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/) plugin to work.** (Of course, you need it)

**[Wiki](https://happyareabean.gitbook.io/bean-docs/plugins/serverpinger)** - **[Configuration](https://happyareabean.gitbook.io/bean-docs/plugins/serverpinger/configuration)** - **[Changelog](https://happyareabean.gitbook.io/bean-docs/plugins/serverpinger/changelog)** - **[Releases](https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/releases)**

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
%serverpinger_protocol_mycoolserver.com:25565%
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

[github-release-url]: https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/releases
[latest-release]: https://img.shields.io/github/v/release/HappyAreaBean/ServerPinger-PAPI-Expansion?label=Version&style=for-the-badge
[latest-pre-release]: https://img.shields.io/github/v/release/HappyAreaBean/ServerPinger-PAPI-Expansion?include_prereleases&label=pre%20release&style=for-the-badge&color=CD7F32
[downloads]: https://img.shields.io/github/downloads/HappyAreaBean/ServerPinger-PAPI-Expansion/total?label=Downloads&style=for-the-badge

[discord-shield]: https://img.shields.io/discord/347679658369613826?color=darkblue&label=DISCORD&style=for-the-badge
[discord-url]: https://go.happyareabean.cc/supportdiscord
[issues-shield]: https://img.shields.io/github/issues/HappyAreaBean/ServerPinger-PAPI-Expansion.svg?style=for-the-badge
[issues-url]: https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/issues