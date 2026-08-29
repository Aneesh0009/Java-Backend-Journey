package com.aneesh.springcore;

import com.aneesh.springcore.external.EmailClient;
import com.aneesh.springcore.service.NotificationService;
import com.aneesh.springcore.service.UserService;
import com.aneesh.springcore.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //UserService us = new userService();
        //UserService userService = context.getBean(UserService.class);
        //UserService userService2 = context.getBean(UserService.class);
        //EmailService emailService = context.getBean(EmailService.class);
        //userService.registerUser();
        //userService.unregisterUser();
        //emailService.sendEmail();
        //EmailClient emailClient = context.getBean(EmailClient.class);
        NotificationService notificationService = context.getBean(NotificationService.class);
        notificationService.notifyUser();

    }
}