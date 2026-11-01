package com.aneesh.SpringSecurity.Service;

import com.aneesh.SpringSecurity.Model.Users;
import com.aneesh.SpringSecurity.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {


    private final UserRepo userRepo;

    private final AuthenticationManager authManager;

    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);

    private final JWTService jwtService;

    public UserService(UserRepo userRepo, AuthenticationManager authManager, JWTService jwtService) {
        this.userRepo = userRepo;
        this.authManager = authManager;
        this.jwtService = jwtService;
    }


    public Users register(Users user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    public String verify(Users user) {
        Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
        if(authentication.isAuthenticated()) {
            return jwtService.getToken(user.getUsername());
        }
        return "failed";
    }
}
