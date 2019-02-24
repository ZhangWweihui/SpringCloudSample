package com.zwh.springcloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/info")
    public String getProjectInfo(){
        return String.format("The project name is %s, the server port is %d", "EurekaClient", port);
    }
}
