package com.ajeet.learnings.design.pattern.behavioral.command;

public class ServeOrder implements Command {

    @Override
    public void execute() {
        System.out.println("Order served to customer !!!");
    }

    @Override
    public void undo() {
        System.out.println("Undo called for serve order because customer dont like the order !!!");
    }
}
