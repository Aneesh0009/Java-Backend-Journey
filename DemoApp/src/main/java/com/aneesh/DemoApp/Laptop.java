package com.aneesh.DemoApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void build(){
        System.out.println("Building a Project ");
    }
}
