
# ⚠ Please read this before download/using it. ⚠
This version used another API to fixes the motd problem with some new features.

And also this version is designed for use on my own server but now is publicly available for everyone.

In original pinger the `motd` placeholder only getting the motd from `server.properties`.

If you don’t need any of these feature or the original version is enough for you to use, you don’t need to switch to this version.

**Still not sure? Recommend you read the [features](#features) list first.**

Let me first declare that I did not say that this version is better than the original.
* I may add some feature as requested but I **do not guarantee** that I will add them.
    * (In most cases, if it takes **little time to add that feature** ~~(and within my abilities)~~, I **might** consider adding)
    * Of course, all the features idea not related to ServerPinger will be rejected.

Feedback / Suggestions always welcome! ❤

---

# ServerPinger

[![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/HappyAreaBean/ServerPinger-PAPI-Expansion?label=latest%20stable&style=for-the-badge)](https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/releases) [![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/HappyAreaBean/ServerPinger-PAPI-Expansion?include_prereleases&label=latest%20beta&style=for-the-badge)](https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/releases) [![GitHub release (latest by date)](https://img.shields.io/github/downloads/HappyAreaBean/ServerPinger-PAPI-Expansion/latest/total?label=Downloads%40Latest&style=for-the-badge)](https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/releases)

**PlaceholderAPI Expansion that allows you to ping servers for information**

**Required [PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/) plugin to work.** (Why i need to mention this)

**[Wiki](https://happyareabean.gitbook.io/bean-docs/plugins/serverpinger)** - **[Configuration](https://happyareabean.gitbook.io/bean-docs/plugins/serverpinger/configuration)** - **[Changelog](https://happyareabean.gitbook.io/bean-docs/plugins/serverpinger/changelog)** - **[Releases](https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/releases)**

<a href="https://go.happyareabean.cc/supportdiscord"><img src="https://images.levats.com/join_us_on_discord.png" alt="drawing" width="300"/></a>

---

# Features
Lets you ping a server through an IP or domain (with port), to check the online-status and to receive some information.
The placeholders have a "warmup" time of around one or two minutes after installing the expansion.
* MOTD Support
* Dynamic online message
* Boolean online
* [Custom Dynamic](https://github.com/HappyAreaBean/ServerPinger-PAPI-Expansion/wiki/Custom-Dynamic) (Added in v2.1+)

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
```

---

# How to install
1. Put `Expansion-ServerPinger.jar` to the folder `plugins\PlaceholderAPI\expansions`
2. /papi reload

---

# Credits

* Original [Pinger](https://github.com/PlaceholderAPI/Pinger-Expansion) expansion

I really not confident to publish any project because i'm not really "master" in java coding and i'm scared it will cause some problem so I always don't do this

but I really want to help other server owners who are facing such problems.

So please, please, please if you find any problem please tell me. I will try my best to solve your problem.
