package com.teamthree.event.controller;

import com.teamthree.event.dto.TicketInsertDto;
import com.teamthree.event.dto.TicketViewDto;
import com.teamthree.event.service.impl.TicketServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {

    private final TicketServiceImpl ticketService;

    public TicketController(TicketServiceImpl ticketService) {
        this.ticketService = ticketService;
    }


    @GetMapping(value = "/getAll")
    public List<TicketViewDto> getAll(@RequestParam(value = "event", required = false) String eventName, @RequestParam(value = "email", required = false) String userName) {

        return ticketService.getAll(eventName, userName);
    }


    @PutMapping(value = "/buy")
    public void buy(@RequestParam("eventId") Long eventId, @RequestParam("userId") Long userid, @RequestParam("noOfTickets") int noIfTickets) {
        ticketService.buy(new TicketInsertDto(eventId, userid, noIfTickets));
    }
}
