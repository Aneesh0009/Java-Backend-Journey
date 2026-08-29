package com.aneesh.springcore.service;

import com.aneesh.springcore.external.EmailClient;

public class NotificationService {

    private final EmailClient emailClient;

    public NotificationService(EmailClient emailClient) {
        this.emailClient = emailClient;
    }

    public void notifyUser() {
        emailClient.send("Welcome to the application");
    }
}