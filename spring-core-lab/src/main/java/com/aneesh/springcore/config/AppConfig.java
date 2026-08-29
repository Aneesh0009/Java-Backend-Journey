package com.aneesh.springcore.config;

import com.aneesh.springcore.external.EmailClient;
import com.aneesh.springcore.service.NotificationService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.aneesh.springcore")
public class AppConfig {

    /*   @Bean
   public UserService userService() {
        return new UserService();
    }
 */

    @Bean
    public EmailClient emailClient() {
        return new EmailClient("smtp.example.com");
    }

    @Bean
    public NotificationService notificationService(
            EmailClient emailClient) {

        return new NotificationService(emailClient);
    }
}