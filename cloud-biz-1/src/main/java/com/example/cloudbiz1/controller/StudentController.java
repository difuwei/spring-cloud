package com.example.cloudbiz1.controller;

import com.example.cloudbiz1.entity.StudentEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")
//http://127.0.0.1:8081/student/detail
public class StudentController {
    @GetMapping(value = "detail")
    public StudentEntity getStudent(){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setAge(18);
        studentEntity.setName("xiaoming");
        return studentEntity;

    }
}
