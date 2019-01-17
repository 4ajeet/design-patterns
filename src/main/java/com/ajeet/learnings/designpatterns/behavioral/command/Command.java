package com.ajeet.learnings.designpatterns.behavioral.command;

/***
 * Nice explanation
 * https://refactoring.guru/design-patterns/command
 * https://airbrake.io/blog/design-patterns/behavioral-command-design-pattern
 *
 * To explain a real world example of the command pattern, we should first outline the basic components that make up the bulk of its logic.
 *
 * Receiver – Receives actions via Commands.
 * Command – Binds an action to a Receiver.
 * Invoker – Handles a collection of Commands and determines when Commands are executed.
 * Client – Manages interactions between Receiver / Command and Command / Invoker.
 *
 */
public interface Command {
    public void execute();
    public void undo();
}
