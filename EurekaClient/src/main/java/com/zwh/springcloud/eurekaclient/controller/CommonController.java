package com.zwh.springcloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class CommonController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/index")
    public String getProjectInfo(){
        return String.format("The project name is %s, the server port is %d", "EurekaClient", port);
    }
}
