Spring Cloud 实战
======================================
[原git地址： Spring Cloud 微服务架构](https://git.coding.net/yirenyishi/springcloud-multi.git)<br>
[原博客地址：微服务架构搭](https://blog.csdn.net/yp090416/article/details/79157407)<br>
        至此感谢各个博主的分享
------------------------------------
服务部署步骤
-----------------------------------
### 1.启动注册中心（优先启动）
>springcloud-eureka-server <br>
>>注册中心访问地址：
    
    http://localhost:8761/
    
    * 账号：root 
    * 密码：booszy

### 2.启动配置中心（优先启动）
>springcloud-config-server

### 3.服务提供者
>springcloud-provider-config

>>请求访问地址：
    
    http://localhost:8100/user/list

### 4.服务消费者

>springcloud-consumer-feign-config-swagger <br>
>springcloud-consumer-ribbon-config-swagger <br>

>>请求访问地址：
    
    http://localhost:8201/user/list
    http://localhost:8201/swagger-ui.html
    http://localhost:8200/user/list
    http://localhost:8200/swagger-ui.html

### 5.负载均衡
>springcloud-zuul

    http://localhost:8400/consumer/user/list
    http://localhost:8400/consumer/swagger-ui.html

### 6.集群监控
>springcloud-hystrix-turbine-dashboard

    http://localhost:8900/hystrix.stream
    在输入框中输入：http://localhost:8900/turbine.stream
    点击：monitor stream
    访问：http://localhost:8200/user/list（多点几下）

### 7.链路追踪服务
>springcloud-zipkin-server

    http://localhost:9411
    
