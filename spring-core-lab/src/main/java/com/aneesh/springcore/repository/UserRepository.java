package com.aneesh.springcore.repository;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void save(){
        System.out.println("Registering User.....");
        System.out.println("User Saved to database...");
    }
}
