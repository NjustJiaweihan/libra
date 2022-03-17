![](https://img.shields.io/badge/status-active-brightgreen) ![](https://img.shields.io/badge/contibutor-4-blue) ![](https://img.shields.io/badge/license-MIT-blue)

## 初衷

看《重构》看得热血沸腾，找个老项目练练手。

## How To Start

### 环境
推荐在docker中搭建基建。
```
# docker-mysql
$ docker pull mysql
$ docker run -itd --name mysql-test -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 mysql

# docker-redis
$ docker pull redis
$ docker run -itd --name redis-test -p 6379:6379 redis

# docker-elasticsearch
$ docker pull elasticsearch:5.6.4
```

### 配置
- 修改`application.yaml`
```
mybatis:
  datasource:
    url: jdbc:mysql://<your ip>:3306/libra

redis:
    host: <your ip>
```
- 启动项目，浏览器访问`http://localhost:8080/swagger-ui.html`

## 更新日志

> 2022.02.12
- LibraLog工具
- QuestionQueryField写法

> 2022.02.26
- repo引入Null对象
- 引入swagger

> 2022.02.27
- 题目策略模式

> 2022.03.05
- 引入libra-open模块

## Contribute
Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

|        |   |
| :-----------: | :-----------: |
| <div align="center"><img width="145" height="145" src="https://s2.loli.net/2021/12/14/jlaXEkN8GOLdKRu.jpg"/></div> <br>[Han J W](https://github.com/NjustJiaweihan) <br>💻 🎨 🤔     | <div align="center"><img width="145" height="145" src="https://s2.loli.net/2021/12/15/JcN5GH4f7kATjuZ.jpg"/></div> <br>[Ding C C](https://github.com/1589371038) <br>👀      |
|<div align="center"><img width="145" height="145" src="https://s2.loli.net/2021/12/15/CvZkp9x7YBb1n2l.jpg"/></div> <br>[msdg](https://github.com/dm4157) <br> 🐛 | <div align="center"><img width="145" height="145" src="https://s2.loli.net/2021/12/15/ZSlECTWI67YgF2i.jpg"/></div> <br>[drinking](https://github.com/drinking) <br> 思考 |

