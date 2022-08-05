package com.example.FirstdemoSpringboot.helloworldcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/run")
    public String hello(){
        return "AMAR KUMAR";
    }
}
