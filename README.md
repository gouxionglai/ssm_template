# ssm-template

## 介绍

**ssm-Template** 是一个j2ee项目快速开发的一个模板，免去了搭建框架的步骤，直接使用，有不足的会后续更新。

#### 组成

##### 主要框架

- **Spring5.2**
- **Springmvc5.2**
- **Mybatis3.5.2** 
- **druid连接池** : 稳定，性能好，还带数据监控面板，详情<https://github.com/alibaba/druid/>。
- **sf4j** ：支持多种日志系统，实际使用的是logback。

##### 工具框架

- **Spring-Test** :包括了常用单元测试、集成测试、Web测试，`Src/Test/Java`下有几个简单的测试类。使用测试框架的好处就是节省时间，无需启动Server就能测试程序。
- **Mybatis-generator** : 根据数据库表快速生成mapper,xml,model
- **commons fileupload**:`spring mvc`中集成了`appache-commons-fileupload`上传组件。上传处理更便捷。

#### 开发工具

##### IDE

推荐idea

##### 依赖管理工具

`Maven`

## 使用

### 下载

```
Download Zip`或者`git clone
	git clone https://github.com/gouxionglai/ssm_template.git
```

### 详细修改

#### 利用[mybatis-generator(MBG)](http://mybatis.github.io/generator/) 生成`model/mapper/mapper.xml`文件

Mybatis考虑到手写XML文件的繁琐，因此开发了MBG工具，通用Mapper这个项目再次简化了mybatis的生成代码数量。ssm-easy-template把mybatis generator放在`build.gradle`中，封装成一个`Gradle Task`。

- **修改generator配置文件**: 打开`gradle.propertis`文件,修改生成信息(数据库信息在`src/main/resources/db-mysql.properties`)，默认如下

```
#生成的model类所在包
modelPackage=com.github.ichenkaihua.model
#生成的mapper接口类所在包
mapperPackage=com.github.ichenkaihua.mapper
#生成的mapper xml文件所在包，默认存储在resources目录下
sqlMapperPackage=mybatis_mapper
```

- **执行 mybatisGenerate task** :

```
./gradlew mybatisGenerate
```

#### 修改项目配置文件

在`src/main/resources`目录下，有下列文件：

```txt
#mybatis-generator文件夹下是生成mapper使用的
#spring配置文件
applicationContext.xml
#logback配置文件
logback-spring.xml
#用户配置文件
message.properties
#spring-mvc配置文件
spring-mvc.xml
#spring-mybatis配置文件
spring-mybatis.xml
#数据库连接文件
jdbc.properties
```

### 修改记录

- 2019-12-19 verson 1.0



## 关于我

**Email**: [gouxionglai@163.com](mailto:gouxionglai@163.com)