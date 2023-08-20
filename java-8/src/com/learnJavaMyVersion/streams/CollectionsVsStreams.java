package com.learnJavaMyVersion.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Jenny");
        names.remove(0); //possible
        System.out.println(names);

        // not possible to modify names.stream();
        //names.stream().

        //possibel to iterated n times
        for(String name:names){
            System.out.println(name);
        }
        for(String name:names){
            System.out.println(name);
        }

        // in streams not possible to iterate n times
        Stream<String> stringStream = names.stream();
        stringStream.forEach(System.out::println);
        //stringStream.forEach(System.out::println); // will not allow to do second iteration on the stream. not allowed


    }
}
