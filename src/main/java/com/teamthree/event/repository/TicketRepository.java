package com.teamthree.event.repository;

import com.teamthree.event.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> , JpaRepository<Ticket, Long> {
}
