# offer-code-backend

## 初始化微服务项目

### 配置并启动 Nacos

- 下载 Nacos : https://github.com/alibaba/nacos/releases/tag/2.0.3
- 创建名为 nacos 的数据库, 使用 `./sql/nacos.sql` 创建表和数据
- 进入 `${nacos}/conf` 目录, 修改 `application.yml` 文件, 在末尾添加:
```properties
spring.datasource.platform=mysql
db.num=1
db.url.0=jdbc:mysql://${自己的地址:端口}/nacos?characterEncoding=utf8&connectTimeout=1 000&socketTimeout=3000&autoReconnect=true
db.user=${自己的username}
db.password=${自己的password}
```
- 启动 Nacos : 进入 `${nacos}/bin` , 执行命令: 
```shell
# linux
sh startup.sh -m standalone
# windows
cmd startup.cmd -m standalone
```
- 访问 `http://localhost:8848/nacos` , 输入用户名和密码都是 nacos , 进入以后是这样的那么 nacos 就初始化完毕:
  ![](https://pictures-1312398124.cos.ap-guangzhou.myqcloud.com/20230226164145.png)

### 启动项目

启动两个类:
- `./infrastructure/gateway/src/main/java/edu/gdut/GatewayApplication.java`
- `./service/service-question/src/main/java/edu/gdut/QuestionApplication.java`

然后访问如下两个 url :
- `http://127.0.0.1:9001/ping`
- `http://localhost:8088/ping`

若两个 url 都能得到如下结果，则初始化完毕：
```json
{
  "code":0,
  "message":"成功",
  "succeed":true,
  "data":{
    "ping":"pong"
  }
}
```