package com.kk.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocController {
    @PostMapping("/test")
    public Object test(@RequestBody String data){
        return JSON.parse(data);
    }
}
