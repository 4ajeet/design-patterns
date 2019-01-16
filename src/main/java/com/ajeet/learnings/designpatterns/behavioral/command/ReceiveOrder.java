package com.ajeet.learnings.design.pattern.behavioral.command;

public class ReceiveOrder implements Command {

    @Override
    public void execute() {
        System.out.println("Order Received !!!");
    }

    @Override
    public void undo() {
        System.out.println("Undo called for receive order !!!");
    }

}
