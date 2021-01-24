package com.atguigu.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author WangGy
 * @Create 2020-12-30-19:46
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX",fallback = PaymentFallbackService.class)//表示服务降级，统一为接口中的方法用PaymentFallbackService类兜底
public interface PaymentHystrixService {


    //成功
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    //超时
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
