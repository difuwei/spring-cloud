package com.example.cloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudGatewayApplication {
//    http://localhost:8083/client/student/detail
//    通过服务名称client访问服务 1，2
    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayApplication.class, args);
    }

}
