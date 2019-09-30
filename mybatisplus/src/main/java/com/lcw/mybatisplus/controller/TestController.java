package com.lcw.mybatisplus.controller;

import com.lcw.mybatisplus.entity.Student;
import com.lcw.mybatisplus.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mybatisplus")
public class TestController {

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/list")
    public List<Student> list(){
        List<Student> students = studentMapper.selectList(null);
        return students;
    }

}
