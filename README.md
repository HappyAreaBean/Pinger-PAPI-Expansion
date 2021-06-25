# Status
**功能與 Pinger 相同，但有更多改進和增強**

**[更改日誌](https://github.com/HappyAreaBean/Status/wiki/Changelog)** - **[設定檔](https://github.com/HappyAreaBean/Status/wiki/%E8%A8%AD%E5%AE%9A%E6%AA%94)** 

# Status

#### 變量列表:
```
%status_motd_<IP:Port>% : 伺服器MOTD
%status_players_<IP:Port>% / %status17_count_<IP:Port>% : 伺服器在線玩家
%status_maxplayers_<IP:Port>% / %status17_max_<IP:Port>% : 伺服器最大在線玩家
%status_pingversion_<IP:Port>% / %status17_pingv_<IP:Port>% : 伺服器版本（協議編號）
%status_version_<IP:Port>% / %status17_serverversion_<IP:Port>% : 伺服器版本（版本文字）
%status_online_<IP:Port>% : 伺服器在線或離線（返回配置中設置的文字）
%status_booleanonline_<IP:Port>% : 伺服器在線或離線（返回 true / false）
%status_isonlineplayers_<IP:Port>% : 伺服器在線返回在線玩家, 離線返回配置中設置的文字
```

Status是使用另一個Pinger，所以如果你使用motd，它將得到伺服器列表顯示的。

#### 安裝方法
1. 把 Expansion-Status.jar 放到目錄 plugins\PlaceholderAPI\expansions 下
2. /papi reload

---

### 備註
* 從版本 `v2.0` 開始, 只需要使用 `status` 即可並不需要分開下載兩個版本
