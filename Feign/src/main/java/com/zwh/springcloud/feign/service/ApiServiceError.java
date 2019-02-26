package com.zwh.springcloud.feign.service;

import org.springframework.stereotype.Component;

@Component
public class ApiServiceError implements ApiService {

    @Override
    public String info() {
        return "服务发生故障！";
    }
}
