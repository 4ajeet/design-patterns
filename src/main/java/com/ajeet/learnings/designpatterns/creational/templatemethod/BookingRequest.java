package com.ajeet.learnings.designpatterns.creational.templatemethod;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class BookingRequest implements Serializable{
    private final List<String> requesters = new ArrayList<>();
    private final int numberOfTickets;

    public BookingRequest(String requester, int numberOfTickets) {
        this.requesters.add(requester);
        this.numberOfTickets = numberOfTickets;
    }

    public BookingRequest(List<String> requesters, int numberOfTickets) {
        this.requesters.addAll(requesters);
        this.numberOfTickets = numberOfTickets;
    }

    public List<String> getRequesters() {
        return requesters;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }
}
