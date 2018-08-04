package com.learnJava.streams;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsvsStreams {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Jenny");

        Stream<String> namesStream = names.stream();

        namesStream.forEach(System.out::println);
        //namesStream.forEach(System.out::println);

    }
}
