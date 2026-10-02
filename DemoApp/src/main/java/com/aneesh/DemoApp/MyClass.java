package com.aneesh.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyClass {
//    @Autowired // Field Injection
//    @Qualifier("desktop")
    private Computer comp;
//    public MyClass(Computer comp) {
//        this.comp = comp;
//    }
    public MyClass(@Qualifier("desktop") Computer comp) {
        this.comp = comp;
    }
    public void build(){
        comp.build();
    }


}
