package com.example.Udaan.Interview.exceptions;

public class UserAlreadyRegisterdException extends RuntimeException {
    public UserAlreadyRegisterdException(String msg) {
        super(msg);
    }
}
