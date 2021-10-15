package com.example.cloudgateway.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class errController {
    @RequestMapping(value = "fallback")
    @HystrixCommand(fallbackMethod = "defaultErr")
    public Object defaultErr(){
        HashMap<String, String> result = new HashMap<>();
        result.put("code","0");
        result.put("msg","err");
        return result;
    }
}
