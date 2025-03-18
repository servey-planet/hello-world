package com.example.hello_world;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldController {
    
    @GetMapping("/Hello")
    public String helloWorld() {
        return new String("Hello World!!");
    }
    @GetMapping("/test")
    public String test() {
        return new String("Test Completed!!");
    }
    
}
