package com.example.test_springboot.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    public Object actionMethod(){
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID", "12345");
        resultObject.put("MEMBER_NAME", "username");
        resultObject.put("MEMBER_TYPE", "A");
        return resultObject;
    }
}