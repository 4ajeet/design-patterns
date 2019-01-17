package com.ajeet.learnings.designpatterns.behavioral.command;

public class PrepareOrder implements Command {

    @Override
    public void execute() {
        System.out.println("Order is in progress !!!");
    }

    @Override
    public void undo() {
        System.out.println("Undo called for prepare order !!!");
    }
}
