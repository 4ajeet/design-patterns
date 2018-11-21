package com.ajeet.learnings.design;

public final class MusicApp {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();

        //Add music to library
        musicLibrary.addMusic(new Music(MusicType.POP, "Singer1"));
        musicLibrary.addMusic(new Music(MusicType.Rock, "Singer1"));
        musicLibrary.addMusic(new Music(MusicType.POP, "Singer2"));
        musicLibrary.addMusic(new Music(MusicType.Rock, "Singer3"));
        musicLibrary.addMusic(new Music(MusicType.POP, "Singer2"));

        MusicVisitor musicVisitor = new PopMusicVisitor();
        musicLibrary.accept(musicVisitor);
    }
}
