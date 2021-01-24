package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author WangGy
 * @Create 2020-12-27-12:27
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentOrderZkMain80 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentOrderZkMain80.class,args);
    }
}
