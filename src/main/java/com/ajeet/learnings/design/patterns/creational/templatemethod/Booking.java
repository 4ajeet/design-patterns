package com.ajeet.learnings.design.patterns.creational.templatemethod;

import java.util.Collections;
import java.util.List;

public abstract class Booking {
    /**
     * This method represents a template method design pattern
     * @param request
     */
   public final void book(BookingRequest request){
       validateRequest(request);
       List<Ticket> ticket = processBooking(request);
       sendConfirmation(request);
   }

    /**
     * Send confirmation to user
     * @param request
     */
    private void sendConfirmation(BookingRequest request) {
       //Send email to user
        System.out.println("Ticket successfully booked for 100 people !!!!");
    }

    /**
     * Process booking
     * @param request
     */
    private List<Ticket> processBooking(BookingRequest request) {
       //Book ticket/tickets
        System.out.println("Ticket booked !!!");
        return Collections.emptyList();
    }

    protected abstract void validateRequest(BookingRequest request);
}
