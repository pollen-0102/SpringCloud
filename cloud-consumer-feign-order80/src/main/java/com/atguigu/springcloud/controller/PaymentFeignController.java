package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WangGy
 * @Create 2020-12-29-11:26
 */
@RestController
@Slf4j
public class PaymentFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPayment(id);
    }

    @GetMapping("/consumer/payment/timeout")
    public String getPaymentFeignTimeOut(){
        //openFeign-ribbon,客户端一般默认等待1秒钟
        //报错原因：默认Feign客户端只等待一秒钟，但是服务端处理需要超过一秒钟（3秒钟），导致Feign客户端不想等待了，直接返回报错。
        //为了避免这样的情况，有时候我们需要设置Feign客户端的超时控制。
        return paymentFeignService.paymentFeignTimeOut();
    }

}
