package com.ajeet.learnings.design.patterns.behavioral.visitor;

public interface Visitable {
    public void accept(MusicVisitor musicVisitor);
}
