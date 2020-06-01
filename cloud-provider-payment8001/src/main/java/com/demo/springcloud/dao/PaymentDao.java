package com.demo.springcloud.dao;

import com.demo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author: WangYuhao
 * @Date:2020/5/31 22:23
 */
@Mapper
public interface PaymentDao {

    public int creat(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);


}
