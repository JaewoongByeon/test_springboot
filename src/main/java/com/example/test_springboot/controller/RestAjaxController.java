package com.example.test_springboot.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RestAjaxController {
    @RequestMapping(value = "/api/ajax", method = RequestMethod.POST)
    public Map<String, Object> getParmWithAjax(@RequestParam Map<String, Object> paramMap) {
        return paramMap;
    }
}