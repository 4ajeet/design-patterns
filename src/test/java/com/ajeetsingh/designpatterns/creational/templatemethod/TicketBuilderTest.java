package com.ajeetsingh.design.patterns.creational.templatemethod;

import com.ajeet.learnings.design.patterns.creational.templatemethod.Ticket;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public final class TicketBuilderTest {

    @Test
    public void buildTicket(){
        Ticket.TicketBuilder builder = Ticket.builder();
        Ticket ticket = builder.setEvent("Movie")
                .setTicketOwner("Someone")
                .setValidFrom(LocalDateTime.now())
                .setValidTo(LocalDateTime.now().plusDays(5))
                .build();

        assertNotNull(ticket);
        assertEquals(ticket.getEvent(), "Movie");
        assertEquals(ticket.getRequester(), "Someone");
        assertEquals(ticket.getValidFrom(), builder.getValidFrom());
        assertEquals(ticket.getValidTo(), builder.getValidTo());
    }
}