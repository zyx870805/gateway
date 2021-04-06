package com.example.gateway.service.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    static volatile int count = 0;
    @GetMapping("/say")
    public String sayHello() {
        System.out.println("start ... " + count++);
        return "[spring-cloud-gateway-service]:say Hello";
    }
}
