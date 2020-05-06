package com.example.demo.controller;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/info")
    public String showInfo() {
        return "git测试1111111";
    }

    // 开发人员写了一句话
    // 开发人员又又又又又又又写了一句话
}
