package com.teamthree.event.service;

import com.teamthree.event.domain.Address;
import com.teamthree.event.domain.EventType;
import com.teamthree.event.dto.EventViewDto;
import com.teamthree.event.dto.TicketViewDto;

import java.time.LocalDateTime;
import java.util.List;

public interface EventService {
    List<EventViewDto> getAllEvent (String name, String description, String country, String city, String streetName, String streetNumber, LocalDateTime date, String type, Integer remainingTicket /*String eventTypeS*/);
}
