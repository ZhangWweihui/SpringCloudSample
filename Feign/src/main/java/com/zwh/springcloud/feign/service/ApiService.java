package com.zwh.springcloud.feign.service;

//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(value = "eurekaclient", fallback = ApiServiceError.class)
public interface ApiService {

    @GetMapping("/info")
    String info();
}
