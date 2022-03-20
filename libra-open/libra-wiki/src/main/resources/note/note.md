## 教程文档
- [docker-es教程](https://blog.csdn.net/qq_42236935/article/details/106544255)
- [mybatis-generator-GUI](https://github.com/zouzg/mybatis-generator-gui)

## 阿里云使用姿势
- [管理账号小号登陆地址](https://signin.aliyun.com/1344726916003379.onaliyun.com/login.htm)

- 登陆服务器
```
$ ssh root@47.100.94.213
# password: Libra#04
```
- mysql
```
$ mysql -h localhost -u libra_dba -p
# password: Libra4#dba
```
- 发送文件至服务器(Mac)
```
$ scp <local dir> root@47.100.94.213:/root/bin
```
- 启动服务
```
$ nohup java -jar ./bin/xxx.jar
```
- 查看java进程
```
$ ps -ef | grep java
```
## Oracle使用姿势
- 登陆服务器
```
$ ssh opc@140.238.11.71 -i /Users/hanjiawei/.ssh/id_rsa_opc
```
- 发送文件至服务器(Mac)
```
scp -i /Users/hanjiawei/.ssh/id_rsa_opc /Users/hanjiawei/libra/libra-application/target/libra-application-0.0.1-SNAPSHOT.jar opc@140.238.11.71:~
```