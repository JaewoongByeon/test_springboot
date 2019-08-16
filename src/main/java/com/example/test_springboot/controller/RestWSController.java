package com.example.test_springboot.controller;

import com.example.test_springboot.service.OrganizationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RestWSController {
    @Autowired
    OrganizationService organizationService;

    @RequestMapping(value = "/ws/organization")
    public Object actionMethod(){
        Object resultObject = new Object();
        resultObject = organizationService.actionMethod();
        return resultObject;
    }
}