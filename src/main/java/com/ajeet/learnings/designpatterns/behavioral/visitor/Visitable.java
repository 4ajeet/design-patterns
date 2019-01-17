package com.ajeet.learnings.designpatterns.behavioral.visitor;

public interface Visitable {
    public void accept(MusicVisitor musicVisitor);
}
