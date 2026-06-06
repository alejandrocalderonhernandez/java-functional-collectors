package com.debuggeandoideas.dtos;

import java.util.List;

public class Artist {

    private final String name;
    private final String country;
    private final String genre;
    private final List<Album> albums;

    public Artist(String name, String country, String genre, List<Album> albums) {
        this.name    = name;
        this.country = country;
        this.genre   = genre;
        this.albums  = albums;
    }

    public String getName()           { return name; }
    public String getCountry()        { return country; }
    public String getGenre()          { return genre; }
    public List<Album> getAlbums()    { return albums; }

    @Override
    public String toString() {
        return "Artist{name='" + name + "', genre='" + genre + "', country='" + country + "'}";
    }
}
