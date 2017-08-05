package com.ajeetsingh.design.patterns.creational.builder;

import com.ajeetsingh.design.patterns.creational.templatemethod.Ticket;

import java.time.LocalDateTime;

/**
 * Builder design pattern
 */
public final class TicketBuilder {
    private String ticketOwner;
    private LocalDateTime validFrom;
    private LocalDateTime validTo;
    private String event; //This should a class, entity

    public static TicketBuilder getBuilder(){
        return new TicketBuilder();
    }

    public String getTicketOwner() {
        return ticketOwner;
    }

    public LocalDateTime getValidFrom() {
        return validFrom;
    }

    public LocalDateTime getValidTo() {
        return validTo;
    }

    public String getEvent() {
        return event;
    }

    public TicketBuilder setTicketOwner(String ticketOwner) {
        this.ticketOwner = ticketOwner;
        return this;
    }

    public TicketBuilder setValidFrom(LocalDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public TicketBuilder setValidTo(LocalDateTime validTo) {
        this.validTo = validTo;
        return this;
    }

    public TicketBuilder setEvent(String event) {
        this.event = event;
        return this;
    }

    /**
     * For example see class <code>Ticket</code>
     * @return
     */
    public Ticket build(){
        //return new Ticket(ticketOwner, validFrom, validTo, event);
        return null;
    }
}
