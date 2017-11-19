dubbo的小例子，包含以下技术点

- 使用springBoot搭建dubbo环境
- dubbo服务之间调用
- 使用skyeye进行日志记录到kafka
- benchmark


1、springboot的dubbo环境使用 spring-boot-starter-dubbox.

添加以下依赖：

```
<dependency>
  <groupId>jthink</groupId>
  <artifactId>spring-boot-starter-dubbox</artifactId>
  <version>0.0.1</version>
</dependency>
```

2、去掉log4j的包依赖，使用logback

```
<exclusions>
    <exclusion>
      <groupId>log4j</groupId>
      <artifactId>log4j</artifactId>
    </exclusion>
    <exclusion>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-log4j12</artifactId>
    </exclusion>
</exclusions>
```



TODO
dubbo服务调用链的Demo，总结