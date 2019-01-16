package com.ajeet.learnings.design.patterns.behavioral.visitor;


import java.util.List;

public interface MusicVisitor {
    public void visit(List<Music> musicList);
}