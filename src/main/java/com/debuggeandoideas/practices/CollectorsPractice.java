package com.debuggeandoideas.practices;

import com.debuggeandoideas.data.DBMusic;
import com.debuggeandoideas.dtos.Artist;

import java.util.*;

public class CollectorsPractice {

    private static List<Artist> artists = DBMusic.ARTISTS;

    /**
     * TAREA 1
     * <p>
     * Agrupa los artistas por país y retorna un mapa donde
     * la clave es el país y el valor es la cantidad de artistas de ese país.
     * <p>
     * Pista: es similar a countSongsByGenre pero más sencillo —
     * no necesitas flatMap, solo agrupar y contar directamente.
     * <p>
     * Ejemplo de salida esperada:
     *   {UK=13, USA=12, Canada=3, Colombia=3, France=1, Puerto Rico=2}
     *
     * @return Map<String, Long> país → cantidad de artistas
     */
    public Map<String, Long> countArtistsByCountry() {
        throw new UnsupportedOperationException("Implementar tarea 1");
    }

    /**
     * TAREA 2
     * <p>
     * Agrupa los artistas por género y retorna un mapa donde
     * la clave es el género y el valor es el conjunto de títulos
     * de álbumes de ese género — sin duplicados.
     * <p>
     * Pista: es similar a getAlbumTitlesByGenre — solo llegas hasta
     * álbumes, no hasta canciones. Usa flatMapping + toSet para
     * eliminar duplicados automáticamente.
     * <p>
     * Ejemplo de salida esperada:
     *   {Rock={Abbey Road, Nevermind, ...}, Pop={Thriller, 1989, ...}}
     *
     * @return Map<String, Set<String>> género → títulos de álbumes sin duplicados
     */
    public Map<String, Set<String>> getAlbumsByGenre() {
        throw new UnsupportedOperationException("Implementar tarea 2");
    }

    /**
     * TAREA 3
     * <p>
     * Divide los artistas en dos grupos según si tienen
     * más de 2 álbumes o no, y retorna los nombres de los artistas
     * de cada grupo concatenados por ", ".
     * <p>
     * Pista: combina partitioningBy con mapping + joining como downstream.
     * Es similar a partitionArtistsByUK pero en lugar de contar,
     * concatenas los nombres.
     * <p>
     * Ejemplo de salida esperada:
     *   {true="The Beatles, Pink Floyd, ...", false="Madonna, Billie Eilish, ..."}
     *
     * @return Map<Boolean, String> true → nombres concatenados con más de 2 álbumes
     *                             false → nombres concatenados con 2 o menos
     */
    public Map<Boolean, String> partitionArtistsByAlbumCount() {
        throw new UnsupportedOperationException("Implementar tarea 3");
    }
}