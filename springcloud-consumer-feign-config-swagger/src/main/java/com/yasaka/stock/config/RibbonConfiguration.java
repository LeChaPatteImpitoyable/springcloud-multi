package com.yasaka.stock.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonConfiguration {

    /**
     * 轮询
     * @return
     */
//    @Bean
//    public IPing ribbonPing() {
//        return new PingUrl();
//    }

    /**
     * 随机
     * @return
     */
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }

    /**
     * 随机
     * @return
     */
//    @Bean
//    public ILoadBalancer ribbonLoadBalancer() {
//        return new ILoadBalancer();
//    }
}
