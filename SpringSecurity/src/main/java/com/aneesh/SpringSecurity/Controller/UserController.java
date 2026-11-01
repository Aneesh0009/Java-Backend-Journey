package com.aneesh.SpringSecurity.Controller;


import com.aneesh.SpringSecurity.Model.Users;
import com.aneesh.SpringSecurity.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        System.out.println(user);
        //return "Login Success";
        return userService.verify(user);
    }
}
