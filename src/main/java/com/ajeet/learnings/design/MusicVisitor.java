package com.ajeet.learnings.design;


import java.util.List;

public interface MusicVisitor {
    public void visit(List<Music> musicList);
}