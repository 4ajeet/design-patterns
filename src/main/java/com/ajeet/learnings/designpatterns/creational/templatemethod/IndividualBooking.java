package com.ajeet.learnings.designpatterns.creational.templatemethod;

public class IndividualBooking extends Booking {

    @Override
    protected void validateRequest(BookingRequest request) {
        System.out.println("This request belongs to indivisual entity !!!!");
    }
}
