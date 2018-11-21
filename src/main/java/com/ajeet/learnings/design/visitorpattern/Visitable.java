package com.ajeet.learnings.design.visitorpattern;

public interface Visitable {
    public void accept(MusicVisitor musicVisitor);
}
