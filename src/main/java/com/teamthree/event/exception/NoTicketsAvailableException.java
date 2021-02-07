package com.teamthree.event.exception;

public class NoTicketsAvailableException extends RuntimeException {

    public NoTicketsAvailableException(int noOfTickets) {
        super(String.format("There are no " +  noOfTickets + " tickets available for the selected event", noOfTickets));
    }
}
