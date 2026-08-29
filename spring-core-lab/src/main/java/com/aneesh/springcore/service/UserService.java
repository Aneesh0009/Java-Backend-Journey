package com.aneesh.springcore.service;


import com.aneesh.springcore.repository.UserRepository;
import org.springframework.stereotype.Service;

//@Component
@Service
public class UserService {

   /* public UserService() {
        System.out.println("UserService object created");
    }
    public void registerUser(){
        System.out.println("User registered");
    }

    public void unregisterUser(){
        System.out.println("User unregistered");
    }
    */

    private final UserRepository Repository;

    public UserService(UserRepository Repository){
        this.Repository = Repository;
    }

    public void registerUser(){
        Repository.save();
    }
}
