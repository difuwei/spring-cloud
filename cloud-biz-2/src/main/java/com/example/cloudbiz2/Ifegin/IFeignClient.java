package com.example.cloudbiz2.Ifegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// biz-1,biz-2注册服务名称为client
@FeignClient(value = "client",path = "/student/feign")
public interface IFeignClient {
    @GetMapping(produces = "application/json")
    String msg();
}
