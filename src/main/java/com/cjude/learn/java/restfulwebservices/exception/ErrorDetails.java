package com.cjude.learn.java.restfulwebservices.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
    public  String message;
    public LocalDateTime timestamp;
    public String details;


    public ErrorDetails(LocalDateTime timestamp, String message, String details) {
        this.message = message;
        this.timestamp = timestamp;
        this.details = details;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getDetails() {
        return details;
    }
}
