package com.example.cloudbiz2.Ifegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// biz-1,biz-2注册服务名称为client
// url属性 表示只会请求该地址
//@FeignClient(value = "client",url = "http://localhost:8081")
//轮训请求所有client服务
@FeignClient(value = "client")
public interface IFeignClient {
    @GetMapping(path = "student/feign",produces = "application/json")
    String msg();
}
