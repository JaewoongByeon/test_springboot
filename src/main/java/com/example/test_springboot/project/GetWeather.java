package com.example.test_springboot.project;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class GetWeather {
    @RequestMapping(value = "/api/weather/raw")
    public Object actionMethod(@RequestParam Map<String, Object> paramMap) {
        RestTemplate restTemplate = new RestTemplate();
        Object resultObject = new Object();
        String targetURL = paramMap.get("url") + "?id=" + paramMap.get("id") + "&appid=" + paramMap.get("appid")
                + "&units=" + paramMap.get("units");
        resultObject = restTemplate.getForObject(targetURL, Object.class);
        return resultObject;
    }
}