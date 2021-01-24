package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author WangGy
 * @Create 2020-12-28-9:46
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulMain80.class,args);
    }
}
