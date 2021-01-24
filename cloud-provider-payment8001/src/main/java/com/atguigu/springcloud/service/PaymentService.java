package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @Author WangGy
 * @Create 2020-12-22-16:58
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);
}
