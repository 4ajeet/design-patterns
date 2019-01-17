package com.ajeet.learnings.designpatterns.behavioral.command;

public class CancelOrder implements Command {
    @Override
    public void execute() {
        System.out.println("Order has been cancelled !!!");
    }

    @Override
    public void undo() {
        System.out.println("You cant undo a cancelled order !!!");
    }
}
