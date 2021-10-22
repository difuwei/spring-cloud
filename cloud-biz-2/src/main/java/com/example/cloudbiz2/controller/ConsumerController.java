package com.example.cloudbiz2.controller;

import com.example.cloudbiz2.Ifegin.IFeignClient;
import com.example.cloudbiz2.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @Resource
    private IFeignClient iFeignClient;
//    @Resource
//    private IFeignClientA iFeignClienta;
    @GetMapping(value = "/stu")
    public void ConsumerStudent(){
        //使用resttemplate发起http请求 biz-1服务
        ResponseEntity<StudentEntity> responseEntity = restTemplate.getForEntity("http://127.0.0.1:8081/student/detail",StudentEntity.class);
        System.out.println(responseEntity.getBody());
//        System.out.println(123);
    }

//    http://localhost:8082/consumer/feign
//    feign客户端调用biz-1,biz-2
    @RequestMapping("/feign")
    public String FeignConsumerStudent(){
        System.out.println(222);
        String s = iFeignClient.msg();
        return  s;
    }
    @RequestMapping("/feign-url")
    public String FeignConsumerStudentUrl(){
        System.out.println(33);
        String s = iFeignClient.msg();
        return  s;
    }
}
