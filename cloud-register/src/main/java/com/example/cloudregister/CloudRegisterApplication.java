package com.example.cloudregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//http://localhost:8085/
@SpringBootApplication
@EnableEurekaServer
public class CloudRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudRegisterApplication.class, args);
    }

}
