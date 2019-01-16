package com.ajeet.learnings.design.pattern.behavioral.command;

public final class RestaurantApp {

    public static void main(String[] args) {

        Waiter waiter = new Waiter();
        Customer customer = new Customer();
        waiter.takeOrder(customer, new ReceiveOrder());
        waiter.takeOrder(customer, new PrepareOrder());
        waiter.undoOrder(customer);

    }
}
