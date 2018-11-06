package com.yasaka.stock.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    
    private static Logger log = LoggerFactory.getLogger(WebMvcConfig.class);
 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        log.debug("加载静态资源处理路径");
        super.addResourceHandlers(registry);
    }
    
}
