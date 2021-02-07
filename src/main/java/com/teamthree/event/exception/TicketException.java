package com.teamthree.event.exception;

public class TicketException extends Exception{
    private int code;

    public TicketException(String message, int code) {
        super(message);
        this.code=code;

    }
}
