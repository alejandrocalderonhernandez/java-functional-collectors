package com.debuggeandoideas.excerices;

import com.debuggeandoideas.data.DBMusic;
import com.debuggeandoideas.dtos.Album;
import com.debuggeandoideas.dtos.Artist;
import com.debuggeandoideas.dtos.Song;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsExercise {

    private static List<Artist> artists = DBMusic.ARTISTS;

    /**
     * groupingBy
     * <p>
     * Agrupa artistas por género y dentro de cada grupo
     * los ordena alfabéticamente por nombre.
     *
     * @return Map<String, List<Artist>> género → artistas ordenados por nombre
     */
    public Map<String, List<Artist>> groupArtistsByGenreSorted() {
        return artists.stream()
                .collect(
                        Collectors.groupingBy( // Collector
                                Artist::getGenre, // Group
                                Collectors.collectingAndThen(    // Collector
                                        Collectors.toList(),
                                        lst -> lst.stream()
                                                .sorted(Comparator.comparing(Artist::getName))
                                                .toList()
                                )
                        )

                );
    }

    /**
     * groupingBy + counting
     * <p>
     * Cuenta cuántas canciones totales hay por género.
     * Requiere flatMap para llegar a las canciones antes de agrupar.
     *
     * @return Map<String, Long> género → total de canciones
     */
    public Map<String, Long> countSongsByGenre() {
        return artists.stream()
                .collect(
                        Collectors.groupingBy( // Collector
                                Artist::getGenre,
                                Collectors.summingLong(artists -> artists
                                        .getAlbums().stream()
                                        .flatMap(album -> album.getSongs().stream())
                                        .count()
                                )
                        ));
    }

    /**
     * groupingBy + mapping
     * <p>
     * Por género, retorna la lista de títulos de todos sus álbumes sin duplicados.
     * Requiere flatMap + distinct dentro del mapping.
     *
     * @return Map<String, Set<String>> género → títulos de álbumes sin duplicados
     */
    public Map<String, Set<String>> getAlbumTitlesByGenre() {
        return artists.stream()
                .collect(
                        Collectors.groupingBy(
                                Artist::getGenre,
                                Collectors.flatMapping(
                                        artist -> artist.getAlbums().stream()
                                                .map(Album::getTitle),
                                        Collectors.toSet()
                                )
                        )
                );
    }

    /**
     * groupingBy + summarizingLong
     * <p>
     * Retorna estadísticas de reproducciones totales por género
     * solo de artistas con más de 2 álbumes.
     * Requiere filter antes de agrupar.
     *
     * @return Map<String, LongSummaryStatistics> género → estadísticas de reproducciones
     */
    public Map<String, LongSummaryStatistics> getReproductionStatsByGenre() {
        return artists.stream()
                .collect(
                        Collectors.groupingBy(
                                Artist::getGenre,
                                Collectors.summarizingLong(
                                        artists ->
                                                artists.getAlbums().stream()
                                                        .flatMap(album -> album.getSongs().stream())
                                                        .mapToLong(Song::getReproductions)
                                                        .sum()
                                )
                        )
                );
    }


    /**
     * partitioningBy
     * <p>
     * Divide artistas entre los que son de UK y los que no,
     * contando cuántos hay en cada grupo.
     *
     * @return Map<Boolean, Long> true → artistas de UK | false → resto
     */
    public Map<Boolean, Long> partitionArtistsByUK() {
        return artists.stream()
                .collect(
                        Collectors.partitioningBy(
                                artist -> artist.getCountry().equals("UK"),
                                Collectors.counting()
                        )
                );
    }

    /**
     * toMap
     * <p>
     * Retorna un mapa con el nombre del artista
     * y el total de canciones que tiene en todo su catálogo.
     * Requiere flatMap para contar las canciones.
     *
     * @return Map<String, Long> nombre → total de canciones
     */
    public Map<String, Long> getArtistSongCount() {
        return artists.stream()
                .collect(
                        Collectors.toMap(
                                Artist::getName,
                                artist -> artist.getAlbums().stream()
                                        .mapToLong(album -> album.getSongs().size())
                                        .sum(),
                                (existingValue, newValue) -> existingValue
                        )
                );
    }

    /**
     * joining
     * <p>
     * Por género, concatena los títulos de todos sus álbumes
     * separados por " | ".
     * Requiere groupingBy + mapping + joining como downstream.
     *
     * @return Map<String, String> género → títulos de álbumes concatenados
     */
    public Map<String, String> getAlbumTitlesJoinedByGenre() {
        return artists.stream()
                .collect(
                        Collectors.groupingBy(
                                Artist::getGenre,
                                Collectors.mapping(
                                        artist -> artist.getAlbums().stream()
                                                .map(Album::getTitle)
                                                .collect(Collectors.joining(" | ")),
                                        Collectors.joining(" | ")

                                )
                        )
                );
    }

    /**
     * collectingAndThen
     * <p>
     * Cuenta el total de artistas del catálogo
     * y devuelve el resultado como un mensaje formateado.
     * Ejemplo de salida esperada:
     *   "Total de artistas en el catálogo: 39"
     *
     * @return String con el total de artistas formateado
     */
    public String getTotalArtistsMessage() {
        return artists.stream()
                .collect(
                        Collectors.collectingAndThen(
                                Collectors.counting(),
                                count -> "Total de artistas en el catálogo: " + count
                        )
                );
    }

}
