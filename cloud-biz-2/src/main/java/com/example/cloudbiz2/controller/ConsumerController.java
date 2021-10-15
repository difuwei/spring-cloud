package com.example.cloudbiz2.controller;

import com.example.cloudbiz2.entity.StudentEntity;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping(value = "/stu")
    public void ConsumerStudent(){
        //使用resttemplate发起http请求 biz-1服务
        ResponseEntity<StudentEntity> responseEntity = restTemplate.getForEntity("http://127.0.0.1:8081/student/detail",StudentEntity.class);
        System.out.println(responseEntity.getBody());
//        System.out.println(123);
    }
}
