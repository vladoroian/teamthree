package com.teamthree.event.service.impl;

import com.teamthree.event.domain.*;
import com.teamthree.event.dto.EventViewDto;
import com.teamthree.event.repository.EventRepository;
import com.teamthree.event.service.EventService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<EventViewDto> getAllEvent(String name, String description, String country, String city, String streetName, String streetNumber, LocalDateTime date, String type, Integer remainingTicket /*String eventTypeS*/) {

        EventType eventType = null;

        if (Objects.nonNull(type) && !type.isEmpty()) {
            eventType = new EventType(Type.valueOf(type));
        }


        List<EventViewDto> eventList = new ArrayList<>();
        Iterable<Event> events = eventRepository.findAll();
        for (Event event : events) {
            EventViewDto eventViewDto = EventViewDto.toEventViewDto(event);
            if (Objects.isNull(name) && Objects.isNull(description) && Objects.isNull(country) && Objects.isNull(city) && Objects.isNull(streetName) && Objects.isNull(streetNumber) && Objects.isNull(eventType)) {
                eventList.add(eventViewDto);
            } /*else if (name.equals("") && description.equals("") && country.equals("") && city.equals("") && streetName.equals("") && streetNumber.equals("") && eventViewDto.getEventType().getType().toString().matches("") *//*&& eventTypeS.equals("")*//*) {
                eventList.add(eventViewDto);
            }*/ else if (eventViewDto.getName().equals(name) && eventViewDto.getCity().equals(city) && eventViewDto.getEventType().equals(eventType)) {
                eventList.add(eventViewDto);
            } else if (Objects.isNull(name) && eventViewDto.getCity().equals(city) && eventViewDto.getEventType().equals(eventType)) {
                eventList.add(eventViewDto);
            } else if (eventViewDto.getName().equals(name) && Objects.isNull(city) && eventViewDto.getEventType().equals(eventType)) {
                eventList.add(eventViewDto);
            } else if (Objects.isNull(name) && Objects.isNull(city) && eventViewDto.getEventType().equals(eventType)) {
                eventList.add(eventViewDto);
            } else if (eventViewDto.getName().equals(name) && Objects.isNull(city) && Objects.isNull(eventType)) {
                eventList.add(eventViewDto);
            } else if (Objects.isNull(name) && eventViewDto.getCity().equals(city) && Objects.isNull(eventType)) {
                eventList.add(eventViewDto);
            } else if (eventViewDto.getName().equals(name) && eventViewDto.getCity().equals(city) && Objects.isNull(eventType)) {
                eventList.add(eventViewDto);
            }
        }
        return eventList;
    }
}
