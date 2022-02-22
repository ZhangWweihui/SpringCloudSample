package com.zwh.springcloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zhangweihui
 */
@RestController
public class CommonController {

    @Value("${spring.application.name}")
    private String appName;
    @Value("${server.port:8080}")
    private int port;


    @GetMapping("/info")
    public String getProjectInfo(){
        return String.format("app name: %s; port: %d", appName, port);
    }

}
