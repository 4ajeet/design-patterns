package com.ajeet.learnings.design.pattern.behavioral.command;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class Waiter {
    private final Map<Customer, LinkedList<Command>> orders = new HashMap<>();

    public void takeOrder(Customer customer, Command command){
        command.execute();
        orders.putIfAbsent(customer, new LinkedList<Command>());
        orders.get(customer).addLast(command);
    }

    public void undoOrder(Customer customer){
        orders.get(customer).stream().forEach(order -> order.undo());
    }
}
