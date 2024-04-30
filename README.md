
<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion">
    <img src="https://user-images.githubusercontent.com/50882051/210489285-c612a94f-cdce-429d-bc07-1069410e8366.png" alt="Logo">
  </a>

<h3 align="center">ServerPinger</h3>

  <p align="center">
    PlaceholderAPI Expansion that allows you to ping servers for information!<br />
    <a href="https://go.happyareabean.cc/serverpingerwiki/overview"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/release">Download from GitHub</a>
    ·
    <a href="https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/issues">Report Bug</a>
    ·
    <a href="https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/issues">Request Feature</a>
    ·
    <a href="https://go.happyareabean.cc/supportdiscord">Discord Support</a>
  </p>

[![GitHub Stable Release][latest-release]][github-release-url]
[![GitHub All Release download][downloads]][github-release-url]
[![Issues][issues-shield]][issues-url]
[![Discord][discord-shield]][discord-url]

[![Download from GitHub][download-github]][download-github-url]
[![Download from SpigotMC][download-spigot]][download-spigot-url]
   
   
**[Wiki](https://go.happyareabean.cc/serverpingerwiki/overview)** - 
**[Configuration](https://go.happyareabean.cc/serverpingerwiki/configuration)** - 
**[Changelog](https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/releases)** - 
**[Releases](https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/releases)**

</div>

# What is ServerPinger?

ServerPinger used another API to fixes the motd problem and came with some new [features](#features).

If you don’t need any of these features or the original version is enough for you to use, you don’t need to switch to/use this version.

**Still not sure? Recommend you read the [features](#features) list first.**

Feedback / Suggestions always welcome! ❤

# Features
Lets you ping a server through an IP or domain (with port), to check the online-status and to receive some information.
The placeholders have a "warmup" time of around one or two minutes after installing the expansion.
* MOTD Support
* Dynamic online message
* Boolean online
* [Custom Dynamic](https://happyareabean.gitbook.io/bean-docs/plugins/serverpinger/custom-dynamic) (Added in v2.1+)

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

# How to install
1. Put `Expansion-ServerPinger.jar` to the folder `plugins\PlaceholderAPI\expansions`
2. /papi reload

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

[download-spigot]: https://img.shields.io/badge/Download%20from-SpigotMC-ed8106?style=for-the-badge
[download-spigot-url]: https://go.happyareabean.cc/serverpingerspigotmc
[download-github]: https://img.shields.io/badge/Download%20from-github-181717?style=for-the-badge
[download-github-url]: https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/releases
