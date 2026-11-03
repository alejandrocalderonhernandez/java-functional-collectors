package com.debuggeandoideas.practices;


import com.debuggeandoideas.data.DBMusic;
import com.debuggeandoideas.dtos.Artist;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsPracticeSolution {

    private static List<Artist> artists = DBMusic.ARTISTS;

    public Map<String, Long> countArtistsByCountry() {
        return artists.stream()
                .collect(
                        Collectors.groupingBy(
                                Artist::getCountry,  // clave — el país
                                Collectors.counting() // cuenta artistas por grupo
                        )
                );
    }

    public Map<String, Set<String>> getAlbumsByGenre() {
        return artists.stream()
                .collect(
                        Collectors.groupingBy(
                                Artist::getGenre,         // clave — el género
                                Collectors.flatMapping(
                                        artist -> artist.getAlbums().stream()
                                                .map(album -> album.getTitle()), // solo hasta álbumes
                                        Collectors.toSet()  // Set elimina duplicados automáticamente
                                )
                        )
                );
    }

    public Map<Boolean, String> partitionArtistsByAlbumCount() {
        return artists.stream()
                .collect(
                        Collectors.partitioningBy(
                                artist -> artist.getAlbums().size() > 2, // condición
                                Collectors.mapping(
                                        Artist::getName,          // extrae el nombre
                                        Collectors.joining(", ")  // concatena con ", "
                                )
                        )
                );
    }
}