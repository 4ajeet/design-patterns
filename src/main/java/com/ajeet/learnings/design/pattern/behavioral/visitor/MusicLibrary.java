package com.ajeet.learnings.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public final class MusicLibrary implements Visitable{
    private final List<Music> muscList = new ArrayList<>();

    @Override
    public void accept(MusicVisitor musicVisitor){
        musicVisitor.visit(muscList);
    }

    public void addMusic(Music music){
        muscList.add(music);
    }
}
