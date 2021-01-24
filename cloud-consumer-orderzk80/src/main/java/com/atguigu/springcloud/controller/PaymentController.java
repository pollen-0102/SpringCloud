package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author WangGy
 * @Create 2020-12-27-12:26
 */
@RestController
@Slf4j
public class PaymentController {


    @Autowired
    private RestTemplate restTemplate;

    public static final String PAYMENT_URL = "http://cloud-provider-payment";


    @GetMapping("/consumer/payment/zk")
    public String getPaymentInfo(){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
    }

}
