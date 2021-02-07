package com.teamthree.event.exception;

public class BuyAtLeastOneTicketException extends RuntimeException {

    public BuyAtLeastOneTicketException() {
        super ("You have to buy at least one ticket.");
    }
}
