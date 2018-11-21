package com.ajeet.learnings.design.pattern.behavioral.visitor;


import java.util.List;

public interface MusicVisitor {
    public void visit(List<Music> musicList);
}