package com.teamthree.event.controller;

import com.teamthree.event.dto.EventViewDto;
import com.teamthree.event.service.impl.EventServiceImpl;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping(value = "/event")
public class EventController {

    private final EventServiceImpl eventService;

    public EventController(EventServiceImpl eventService) {
        this.eventService = eventService;
    }

    @GetMapping(value = "/getAllEvents")
    public List<EventViewDto> getAllEvent(@RequestParam(value = "name", required = false) String name,
                                          @RequestParam(value = "description", required = false) String description,
                                          @RequestParam(value = "country", required = false) String country,
                                          @RequestParam(value = "city", required = false) String city,
                                          @RequestParam(value = "streetName", required = false) String streetName,
                                          @RequestParam(value = "streetNumber", required = false) String streetNumber,
                                          @RequestParam(value = "date", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date,
                                          @RequestParam(value = "eventType", required = false) String eventType,
                                          @RequestParam(value = "remainingTicket", required = false) Integer remainingTicket /*@RequestParam("eventType") String eventTypeS*/) {

        return eventService.getAllEvent(name, description, country, city, streetName, streetNumber, date, eventType, remainingTicket /*eventTypeS*/);
    }
}
