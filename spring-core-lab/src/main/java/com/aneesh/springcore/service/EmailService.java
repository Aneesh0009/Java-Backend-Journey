package com.aneesh.springcore.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
    public EmailService() {
        System.out.println("EmailService created");
    }
    public void sendEmail() {
        System.out.println("Sending email...");
    }
}
