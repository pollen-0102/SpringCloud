package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author WangGy
 * @Create 2020-12-22-17:08
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
//        log.info("*******插入*****" + result);
        if (result > 0) {
            return new CommonResult(200, "插入成功，serverPort："+serverPort, result);
        } else {
            return new CommonResult(444, "插入失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
//        log.info("******查询********" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功，serverPort："+serverPort, payment);
        } else {
            return new CommonResult(444, "没有查询到数据，id为" + id, null);
        }
    }


    @GetMapping("/payment/lb")
    public String paymentLB(){
        return serverPort;
    }
}
