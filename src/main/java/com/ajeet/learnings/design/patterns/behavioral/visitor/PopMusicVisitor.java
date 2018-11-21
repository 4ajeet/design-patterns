package com.ajeet.learnings.design.patterns.behavioral.visitor;

import java.util.List;
import java.util.Objects;

public final class PopMusicVisitor implements MusicVisitor {

    @Override
    public void visit(List<Music> musicList) {
        Objects.requireNonNull(musicList, "MusicList cant be null.");
        musicList.stream()
                .filter(music -> MusicType.POP.equals(music.getType()))
                .forEach(System.out::println);
    }
}
