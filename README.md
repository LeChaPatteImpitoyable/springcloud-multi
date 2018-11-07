Spring Cloud 实战
======================================
[原git地址： Spring Cloud 微服务架构](https://git.coding.net/yirenyishi/springcloud-multi.git)<br>
[原博客地址：微服务架构搭](https://blog.csdn.net/yp090416/article/details/79157407)
        至此感谢各个博主的分享
------------------------------------
服务部署步骤
-----------------------------------
###1.启动注册中心（优先启动）
>springcloud-eureka-server <br>
>>注册中心访问地址：
    
    http://localhost:8761/
    
    * 账号：root 
    * 密码：booszy

###2.启动配置中心（优先启动）
>springcloud-config-server

###3.服务提供者
>springcloud-provider-config

>>请求访问地址：
    
    http://localhost:8100/user/list

###4.服务消费者

>springcloud-consumer-feign-config-swagger <br>
>springcloud-consumer-ribbon-config-swagger

请求访问地址：
    
    http://localhost:8201/user/list
    http://localhost:8201/swagger-ui.html

###5.负载均衡
>springcloud-zuul
