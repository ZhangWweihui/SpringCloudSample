package com.zwh.springcloud.feign.controller;

import com.zwh.springcloud.feign.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping("info")
    public String info(){
        return apiService.info();
    }
}
