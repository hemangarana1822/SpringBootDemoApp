package com.gl.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("Hello Spring Boot Application");
        System.out.println("Hello Spring Boot");
        return "Hello from Spring Boot!";
    }
}
