package com.debuggeandoideas;


import com.debuggeandoideas.excerices.CollectorsExercise;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CollectorsExercise collectorsExercise = new CollectorsExercise();


    }


    public static <K, V> void printMap(Map<K, V> map) {
        map.forEach((key, value) -> IO.println(key + " → " + value));
    }

}