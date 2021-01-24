package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  cmd->curl -X POST "http://localhost:3344/actuator/bus-refresh"
 * @Author WangGy
 * @Create 2021-01-19-16:00
 */
@RestController
@RefreshScope
public class ConfigClientController {

    //读取GitHub上的config.info信息
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
