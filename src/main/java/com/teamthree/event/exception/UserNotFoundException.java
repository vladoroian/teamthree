package com.teamthree.event.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super(String.format("User with Id %d not found", id));
    }
}

