/**
 * 
 */
package com.yasaka.stock.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 
 * Druid 数据源配置
 * 
 * @author zhangqian
 *
 */
@Configuration
public class DruidDataSourceConfig {
    
    @Bean
    @ConfigurationProperties("spring.datasource.druid")
    public DataSource druidDataSource() {
        return DruidDataSourceBuilder.create().build();
    }
    
}
