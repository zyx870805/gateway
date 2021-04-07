package com.example.gateway.provider.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosController {

    @GetMapping("/say")
    public String sayHello() {
        System.out.println("say ...");
        return "[spring-cloud-nacos-gateway-provider]:sayHello";
    }
}
