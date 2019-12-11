package com.springboot.task.controller;

import com.springboot.task.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService hservice;
    @GetMapping(value = "async")
    public String runTask(){
        hservice.sendHello();
        return "success";
    }
}
