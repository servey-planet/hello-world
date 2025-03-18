package com.example.hello_world.Service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class HelloWorldServiceTest {
    
    @Test
    public void testHelloWorld() {
        HelloWorldService helloWorld = new HelloWorldService();
        String helloStr = helloWorld.helloWorld("Misako");
        assert(helloStr.equals("Hello Misako!!"));
    }  
}
