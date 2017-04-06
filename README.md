# spclouddemo
这是使用`Spring Cloud`的demo

* `common`：存放的公共bean
* `eurekaservice`：注册中心
* `userconsole`：调用服务的客户端
* `userservice`：提供服务的服务端
* `zipkinserver`：zipkin server服务

### 启动步骤
在idea工具中，启动步骤如下：

1. 启动`eurekaservice`中的`EurakaServiceApp`
2. 启动`zipkinserver`中的`ZipkinServerApp`
2. 启动`userservice`中的`UserServiceApp`
3. 启动`userconsole`中的`UserControllerApp`


### 常用URL
在启动完`userservice`时，可以通过`http://localhost:9002/swagger-ui.html`
来查看swagger的信息。

在所有服务启动完成后，可以通过`http://localhost:9411`访问zipkin的监控页面
