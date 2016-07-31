#优雅的SSM架构(Spring+SpringMVC+Mybatis）
- Maven
- Spring（IOC DI 声明式事务处理）
- SpringMVC（支持Restful风格）
- Hibernate Validate（参数校验）
- Mybatis（最少配置方案）
- Quartz时间调度
- Redis缓存（ProtoStuff序列化）
- **[Redis Sentinel主从高可用方案](http://wosyingjun.iteye.com/blog/2289593)**
- **[Druid（数据源配置 sql防注入 sql性能监控)](http://wosyingjun.iteye.com/blog/2306139)**
- 统一的异常处理
- JSP JSTL

###**架构图：**
![](http://i.imgur.com/EvH40td.png)

###**SSM Start:**
- 创建数据库ssm 执行resources->sql-schema.sql文件  将数据库信息配置到jdbc.properties
- 修改redis.properties  自己环境的redis配置信息 (可以注释账号密码)

###**Update:**
- 添加ResultCode.java定义异常代码 模块定义更清晰 基础code定义
- BaseResult.java定义全局返回code 

###**todo**
- 集成mongo
- 远程调用rpc hession等