package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 搭建豪猪哥监控8001微服务
 * @Author WangGy
 * @Create 2021-01-08-14:19
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoardMain9001 {
    public static void main(String[] args) {
        //http://localhost:9001/hystrix进入监控页面
        SpringApplication.run(HystrixDashBoardMain9001.class,args);
    }
}
