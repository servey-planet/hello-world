package com.example.hello_world.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.hello_world.Service.HelloWorldService;


@RestController
public class HelloWorldController {
    
    @GetMapping("/Hello")
    public String helloWorld() {
        HelloWorldService helloWorld = new HelloWorldService();
        String helloStr = helloWorld.helloWorld("World");
        return helloStr;
    }
    @GetMapping("/test")
    public String test() {
        return new String("Test Completed!!");
    }
    
}
