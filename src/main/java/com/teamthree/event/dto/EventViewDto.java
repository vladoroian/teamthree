package com.teamthree.event.dto;


import com.teamthree.event.domain.Event;
import com.teamthree.event.domain.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EventViewDto implements Serializable {

    private Long id;
    private String name;
    private String description;
    private String country;
    private String city;
    private String streetName;
    private String streetNumber;
    private LocalDateTime date;
    private EventType eventType;
    private Integer remainingTicket;


    public static EventViewDto toEventViewDto(Event event) {
        EventViewDto evt = new EventViewDto();
        evt.id = event.getId();
        evt.name = event.getName();
        evt.description = event.getDescription();
        evt.country = event.getAddress().getCountry();
        evt.city = event.getAddress().getCity();
        evt.streetName = event.getAddress().getStreetName();
        evt.streetNumber = event.getAddress().getStreetNumber();
        evt.date = event.getDate();
        evt.eventType = event.getEventType();
        evt.remainingTicket = event.getMaxTicketNumber() - event.getSoldTicketNumber();
        return evt;
    }
}
