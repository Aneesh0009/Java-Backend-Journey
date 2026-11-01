
package com.aneesh.SpringSecurity.Service;

import com.aneesh.SpringSecurity.Model.UserPricipal;
import com.aneesh.SpringSecurity.Model.Users;
import com.aneesh.SpringSecurity.Repo.UserRepo;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private final UserRepo userRepo;

    public MyUserDetailsService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        System.out.println("1. Looking up username: " + username);
        System.out.println("2. UserRepo object: " + userRepo);

        try {
            Users user = userRepo.findByUsername(username);

            System.out.println("3. Repository call completed");

            if (user == null) {
                throw new UsernameNotFoundException(
                        "User not found: " + username
                );
            }

            System.out.println("4. User found: " + user.getUsername());
            return new UserPricipal(user);

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}