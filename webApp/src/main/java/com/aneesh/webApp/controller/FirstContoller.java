package com.aneesh.webApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstContoller {

    @RequestMapping("/")
    public String greeting(){
        return "Hello World!";
    }

    @RequestMapping("/about")
    public String About(){
        return "About Page";
    }
}
