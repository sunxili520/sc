package com.kyoxue.cfg;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author admin
 * @version 1.0
 * @description com.kyoxue.cfg
 * @date 2020/11/27
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced//负债均衡调用
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
