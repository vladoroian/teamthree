package com.teamthree.event.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketInsertDto {

    private Long eventId;
    private Long userId;
    private int noOfTickets;

}
