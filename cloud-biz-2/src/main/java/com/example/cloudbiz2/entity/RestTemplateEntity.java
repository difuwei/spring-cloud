package com.example.cloudbiz2.entity;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//@Service 和component好像都可以 产生一个bean对象，在consumercontroller中可以注入使用
//@Component就是跟<bean>一样，可以托管到Spring容器进行管理。
@Component
public class RestTemplateEntity {
    @Bean
    @LoadBalanced // 开启负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
