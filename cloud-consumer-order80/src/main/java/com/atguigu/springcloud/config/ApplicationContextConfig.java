package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author WangGy
 * @Create 2020-12-23-10:03
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced   //实现负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
