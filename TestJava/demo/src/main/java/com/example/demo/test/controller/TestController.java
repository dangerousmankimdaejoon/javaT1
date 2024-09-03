package com.example.demo.test.controller;

import com.example.demo.test.model.T1;
import com.example.demo.test.service.TestService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
public class TestController {
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService= testService;
    }
    
    @GetMapping("/t1")
    public List<T1> test(Model model) {

        List<T1> t1 =  testService.getT1Data();

        model.addAttribute("test", t1);
        //return "t1";
        return t1;
    }
}