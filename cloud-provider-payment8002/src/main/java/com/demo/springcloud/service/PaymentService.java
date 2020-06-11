package com.demo.springcloud.service;

import com.demo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: WangYuhao
 * @Date:2020/5/31 23:28
 */
public interface PaymentService {

    public int creat(Payment payment);

    public Payment getPaymentById(Long id);
}
