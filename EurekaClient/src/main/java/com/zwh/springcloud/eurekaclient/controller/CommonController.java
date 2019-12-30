package com.zwh.springcloud.eurekaclient.controller;

import com.zwh.springcloud.eurekaclient.common.FTPInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RefreshScope
public class CommonController {

    //@Value("${server.port}")
    private int port;

    //@Autowired
    private FTPInfo ftpInfo;

    //@GetMapping("/index")
    public String getProjectInfo(){
        return String.format("The project name is %s, the server port is %d", "EurekaClient", port);
    }

    //@GetMapping("/ftp")
    public String getFtpInfo(){
        return String.format("The FTP host is %s, the FTP user is %s, the FTP password is %s",
                ftpInfo.getHost(),ftpInfo.getUser(),ftpInfo.getPassword());
    }
}
