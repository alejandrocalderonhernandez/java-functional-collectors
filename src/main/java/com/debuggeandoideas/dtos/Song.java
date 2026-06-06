package com.debuggeandoideas.dtos;

public class Song {

    private final String title;
    private final int durationSeconds;
    private final int reproductions;

    public Song(String title, int durationSeconds, int reproductions) {
        this.title           = title;
        this.durationSeconds = durationSeconds;
        this.reproductions   = reproductions;
    }

    public String getTitle()          { return title; }
    public int getDurationSeconds()   { return durationSeconds; }
    public int getReproductions()     { return reproductions; }

    @Override
    public String toString() {
        return "Song{title='" + title + "', duration=" + durationSeconds + "s}";
    }
}