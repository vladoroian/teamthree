package com.teamthree.event.service;

import com.teamthree.event.dto.TicketInsertDto;
import com.teamthree.event.dto.TicketViewDto;
import com.teamthree.event.exception.TicketException;

import java.util.List;

public interface TicketService {

    List<TicketViewDto> getAll (String eventName, String userName);
    void buy (TicketInsertDto ticketInsertDto);

}
