package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author WangGy
 * @Create 2020-12-29-11:15
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")//服务在cloud-provider-payment8001
public interface PaymentFeignService {

    @GetMapping("/payment/get/{id}")//根据提供者的地址来写的，方法名不做要求
    CommonResult<Payment> getPayment(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    String paymentFeignTimeOut();

}
