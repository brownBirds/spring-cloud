package com.demo.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: WangYuhao
 * @Date:2020/6/1 10:37
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced  //启动负载均衡，默认是轮询
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
