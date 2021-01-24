package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 原理：微服务应用放置于同一个group中，就能够保证消息只会被其中一个应用消费一次。不同的组是可以消费的，同一个组内会发生竞争关系，只有其中一个可以消费
 * 故障现象：重复消费
 * 导致原因：默认分组group是不同的，组流水号不一样，被认为不同组，可以消费
 * 解决：自定义配置分组，分到同一个组，解决重复消费问题
 * @Author WangGy
 * @Create 2021-01-22-16:16
 */
@SpringBootApplication
public class StreamMQMain8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8803.class,args);
    }
}
