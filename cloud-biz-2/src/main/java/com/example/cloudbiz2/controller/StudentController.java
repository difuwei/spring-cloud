package com.example.cloudbiz2.controller;

import com.example.cloudbiz2.entity.StudentEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
//    http://wxte.com:8082/student/detail
//    http://localhost:8082/student/detail
    @GetMapping(value = "detail")
    public StudentEntity getStudent(){
//        try{
//            // 模拟网关请求 超时，触发熔断，返回网关中配置的默认错误
//            TimeUnit.SECONDS.sleep(4);
//            System.out.println("sleep 4s");
//        }catch (Exception e){
//
//        }
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setAge(20);
        studentEntity.setName("xiaoming");
        return studentEntity;

    }
}
