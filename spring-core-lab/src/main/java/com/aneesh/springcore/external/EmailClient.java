package com.aneesh.springcore.external;

public class EmailClient {

    private final String host;

    public EmailClient(String host) {
        this.host = host;
    }

    public void send(String message) {
        System.out.println(
                "Email sent through " + host +
                        ": " + message
        );
    }
}