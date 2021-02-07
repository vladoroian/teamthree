package com.teamthree.event.exception;

public class EventNotFoundException extends RuntimeException{

    public EventNotFoundException(Long id) {
        super(String.format("Event with Id %d not found", id));
    }
}
