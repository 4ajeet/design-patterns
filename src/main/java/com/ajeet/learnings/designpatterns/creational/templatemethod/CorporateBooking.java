package com.ajeet.learnings.design.patterns.creational.templatemethod;

public final class CorporateBooking extends Booking {

    @Override
    protected void validateRequest(BookingRequest request) {
        //Validate  - it should be a registered corporate user
        System.out.println("This request belongs to corporate entity !!!!");
    }
}
