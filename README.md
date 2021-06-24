# Status
**功能與 Pinger 相同，但有更多改進和增強**

**[點擊我查看更改日誌](https://github.com/HappyAreaBean/Status/wiki/Changelog)**

# Status (1.8 以下)

#### 變量列表:
```
%status17_motd_<IP:Port>% : 伺服器MOTD
%status17_players_<IP:Port>% / %status17_count_<IP:Port>% : 伺服器在線玩家
%status17_maxplayers_<IP:Port>% / %status17_max_<IP:Port>% : 伺服器最大在線玩家
%status17_pingversion_<IP:Port>% / %status17_pingv_<IP:Port>% : 伺服器版本（協議編號）
%status17_version_<IP:Port>% / %status17_serverversion_<IP:Port>% : 伺服器版本（版本文字）
%status17_online_<IP:Port>% : 伺服器在線或離線（返回配置中設置的文字）
%status17_booleanonline_<IP:Port>% : 伺服器在線或離線（返回 true / false）
%status17_isonlineplayers_<IP:Port>% : 伺服器在線返回在線玩家, 離線返回配置中設置的文字
```

Status是使用另一個Pinger，所以如果你使用motd，它將得到伺服器列表顯示的。

#### 安裝方法
1. 把 Expansion-Status1_8_Below.jar 放到目錄 plugins\PlaceholderAPI\expansions 下
2. /papi reload

---

# Status (1.9 以上)

#### 變量列表:
```
與上面的 1.8 相同，將 status17 替換為 status19 即可
```

Status是使用另一個Pinger，所以如果你使用motd，它將得到伺服器列表顯示的。

#### 安裝方法
1. 把 Expansion-Status1_9_Above.jar 放到目錄 plugins\PlaceholderAPI\expansions 下
2. /papi reload
