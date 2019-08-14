package com.example.test_springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HelloController {
    @RequestMapping(value = "/resthello")
    public String hello() {
        return "Hello World!";
    }
}