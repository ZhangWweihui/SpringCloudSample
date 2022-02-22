package com.zwh.springcloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangweihui
 */
@FeignClient(value = "eureka-client", fallback = ApiServiceError.class)
public interface ApiService {

    @GetMapping("/info")
    String info();
}
