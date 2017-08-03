package com.ajeetsingh.design.patterns.creational.templatemethod;

public class IndividualBooking extends Booking {

    @Override
    protected void validateRequest(BookingRequest request) {
        System.out.println("This request belongs to indivisual entity !!!!");
    }
}
