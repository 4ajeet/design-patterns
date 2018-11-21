package com.ajeet.learnings.design.patterns.creational.templatemethod;

import java.io.Serializable;
import java.time.LocalDateTime;

public final class Ticket implements Serializable {
    private final String requester;
    private final LocalDateTime validFrom;
    private final LocalDateTime validTo;
    private final String event; //This should a class, entity

    private Ticket(String requester, LocalDateTime validFrom, LocalDateTime validTo, String event) {
        this.requester = requester;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.event = event;
    }

    public String getRequester() {
        return requester;
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

    public static TicketBuilder builder(){
        return new TicketBuilder();
    }

    public static final class TicketBuilder {
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

        public Ticket build(){
            return new Ticket(ticketOwner, validFrom, validTo, event);
        }
    }
}
