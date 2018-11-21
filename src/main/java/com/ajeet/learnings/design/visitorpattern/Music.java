package com.ajeet.learnings.design.visitorpattern;

import java.io.Serializable;

public final class Music implements Serializable {
    private final MusicType musicType;
    private final String singer;

     public Music(MusicType musicType, String singer) {
        this.musicType = musicType;
        this.singer = singer;
    }

    public MusicType getType() {
        return musicType;
    }

    public String getSinger() {
        return singer;
    }

    @Override
    public String toString(){
         return "Music of type " + musicType.name() + ", sing by " + singer;
    }
}
