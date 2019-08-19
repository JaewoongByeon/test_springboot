package com.example.test_springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class RestOpenWeatherController {
    @RequestMapping(value = "/remote/openweather")
    public Object actionMethod() {
        RestTemplate restTemplate = new RestTemplate();
        Object resultObject = new Object();
        String keyId = "884012cf97a0e88c53af7962cf5a0ad8";
        String targetUri = "https://api.openweathermap.org/data/2.5/weather?q=Seoul&appid=" + keyId;
        resultObject = restTemplate.getForObject(targetUri, Object.class);
        return resultObject;
    }
}