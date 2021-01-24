package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author WangGy
 * @Create 2020-12-28-9:51
 */
@RestController
public class PaymentConsulController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String PAYMENT_URL = "http://Consul-payment-provider";

    @GetMapping("/consumer/consul")
    public String getPaymentInfo(){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/consul",String.class);
    }
}
