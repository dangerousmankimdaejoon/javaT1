package com.example.demo.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

@RestController
//@RequestMapping("/t2")
public class testController1 {
    
    @GetMapping("/test123")
    public String test() {
        System.out.println("Hello world");
        return "Hello World";
    }
}