package com.atguigu.myrule;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author WangGy
 * @Create 2020-12-28-14:21
 */
@Configuration
public class MySelfRule {
    //注意此配置不能被扫描到，故放在外围
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();  //定义为随机
    }


}
