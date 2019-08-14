package com.example.test_springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TryRestController {
    @RequestMapping(value = "/test/map")
    public Object actionMethod(){
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("key1", "value1");
        resultObject.put("key2", "value2");
        resultObject.put("key3", "value3");
        resultObject.put("key4", "value4");
        return resultObject;
    }
}