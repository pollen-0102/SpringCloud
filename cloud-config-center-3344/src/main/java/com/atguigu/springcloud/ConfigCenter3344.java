package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *  cmd->curl -X POST "http://localhost:3344/actuator/bus-refresh"
 *  动态刷新，定点通知（指定通知某个微服务）
 *  curl -X POST "http://localhost:3344/actuator/bus-refresh/config-client:3355"
 * @Author WangGy
 * @Create 2021-01-14-17:04
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenter3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenter3344.class,args);
    }
}
