package com.debuggeandoideas.dtos;

import java.util.List;

public class Album {

    private final String title;
    private final int year;
    private final List<Song> songs;

    public Album(String title, int year, List<Song> songs) {
        this.title = title;
        this.year  = year;
        this.songs = songs;
    }

    public String getTitle()      { return title; }
    public int getYear()          { return year; }
    public List<Song> getSongs()  { return songs; }

    @Override
    public String toString() {
        return "Album{title='" + title + "', year=" + year + "}";
    }
}
