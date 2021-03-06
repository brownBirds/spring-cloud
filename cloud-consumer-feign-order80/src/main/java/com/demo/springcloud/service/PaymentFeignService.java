package com.demo.springcloud.service;

import com.demo.springcloud.entities.CommonResult;
import com.demo.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: WangYuhao
 * @Date:2020/6/15 21:49
 */

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value ="/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);



}
