package com.ajeet.learnings.designpatterns.behavioral.visitor;


import java.util.List;

public interface MusicVisitor {
    public void visit(List<Music> musicList);
}