package com.example.test_springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RestList {
    @RequestMapping(value = "/ws/organizationlist")
    public Object actionMethod() {
        List<Object> resultObject = new ArrayList<Object>();
        Map<String, Object> data01 = new HashMap<String, Object>();
        data01.put("MEMBER_ID", "103029301202");
        data01.put("MEMBER_NAME", "username");
        data01.put("MEMBER_STATUS", "normal");
        data01.put("MEMBER_TYPE", "admin");
        Map<String, Object> data02 = new HashMap<String, Object>();
        data02.put("CONTACT_PHONE", "021234567");
        data02.put("CONTACT_CITY", "Seoul");
        data02.put("CONTACT_COUNTRY", "Korea");
        resultObject.add(data01);
        resultObject.add(data02);
        return resultObject;
    }
}