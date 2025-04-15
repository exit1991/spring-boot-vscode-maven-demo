package com.example.spring_boot_vscode_maven_demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String index() {
        return "Hello Spring Boot!!";
    }
    
}
