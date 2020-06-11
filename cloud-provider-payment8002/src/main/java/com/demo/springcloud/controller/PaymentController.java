package com.demo.springcloud.controller;

import com.demo.springcloud.entities.CommonResult;
import com.demo.springcloud.entities.Payment;
import com.demo.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: WangYuhao
 * @Date:2020/5/31 23:37
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")

    public CommonResult creat( @RequestBody Payment payment){
        int result = paymentService.creat(payment);
        log.info("****插入结果："+result);

        if(result > 0){
            return  new CommonResult(200,"插入数据库成功,serverPort: " + serverPort,result);
        } else {
            return new CommonResult(444,"插入数据库失败",null);
        }

    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果："+payment);

        if (payment!=null){
            return  new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询ID："+id,null);
        }

    }


}
