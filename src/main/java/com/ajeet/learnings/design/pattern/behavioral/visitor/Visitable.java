package com.ajeet.learnings.design.pattern.behavioral.visitor;

public interface Visitable {
    public void accept(MusicVisitor musicVisitor);
}
