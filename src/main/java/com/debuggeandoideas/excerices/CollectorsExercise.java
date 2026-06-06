package com.debuggeandoideas.excerices;

import com.debuggeandoideas.dtos.Artist;
import com.debuggeandoideas.dtos.Song;

import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.Optional;

public class CollectorsExercise {

    /**
     * groupingBy
     * <p>
     * Agrupa artistas por género y dentro de cada grupo
     * los ordena alfabéticamente por nombre.
     *
     * @return Map<String, List<Artist>> género → artistas ordenados por nombre
     */
    public Map<String, List<Artist>> groupArtistsByGenreSorted() {
        throw new UnsupportedOperationException("Implementar groupingBy");
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
        throw new UnsupportedOperationException("Implementar groupingBy + counting");
    }

    /**
     * groupingBy + mapping
     * <p>
     * Por género, retorna la lista de títulos de todos sus álbumes sin duplicados.
     * Requiere flatMap + distinct dentro del mapping.
     *
     * @return Map<String, List<String>> género → títulos de álbumes sin duplicados
     */
    public Map<String, List<String>> getAlbumTitlesByGenre() {
        throw new UnsupportedOperationException("Implementar groupingBy + mapping");
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
        throw new UnsupportedOperationException("Implementar groupingBy + summarizingLong");
    }

    /**
     * groupingBy + maxBy
     * <p>
     * Por género, encuentra la canción más reproducida.
     * Requiere flatMap + flatMap antes de agrupar.
     *
     * @return Map<String, Optional<Song>> género → canción más reproducida
     */
    public Map<String, Optional<Song>> getMostReproducedSongByGenre() {
        throw new UnsupportedOperationException("Implementar groupingBy + maxBy");
    }

    /**
     * groupingBy + minBy
     * <p>
     * Por país del artista, encuentra la canción más corta.
     * Requiere flatMap + flatMap antes de agrupar.
     *
     * @return Map<String, Optional<Song>> país → canción más corta
     */
    public Map<String, Optional<Song>> getShortestSongByCountry() {
        throw new UnsupportedOperationException("Implementar groupingBy + minBy");
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
        throw new UnsupportedOperationException("Implementar partitioningBy");
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
        throw new UnsupportedOperationException("Implementar toMap");
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
        throw new UnsupportedOperationException("Implementar joining");
    }

    /**
     * collectingAndThen
     * <p>
     * Agrupa artistas por país, cuenta cuántos hay en cada grupo
     * y devuelve el mapa inmutable.
     *
     * @return Map<String, Long> inmutable — país → cantidad de artistas
     */
    public Map<String, Long> getImmutableArtistCountByCountry() {
        throw new UnsupportedOperationException("Implementar collectingAndThen");
    }

    /**
     * mapping
     * <p>
     * Por género, retorna la lista de títulos de todas sus canciones
     * sin duplicados.
     * Requiere flatMap + flatMap + distinct dentro del mapping.
     *
     * @return Map<String, List<String>> género → títulos de canciones sin duplicados
     */
    public Map<String, List<String>> getSongTitlesByGenre() {
        throw new UnsupportedOperationException("Implementar mapping");
    }
}
