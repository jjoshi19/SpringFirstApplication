package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringFirstController {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello from Spring!";
    }
}
