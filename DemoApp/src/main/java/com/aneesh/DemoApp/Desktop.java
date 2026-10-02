package com.aneesh.DemoApp;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
    public void build(){
        System.out.println("Building a Project Faster");
    }
}
