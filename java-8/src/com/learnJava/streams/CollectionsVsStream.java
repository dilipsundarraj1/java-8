package com.learnJava.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");

        for(String name : names){
            System.out.println(name);
        }

        for(String name : names){
            System.out.println(name);
        }

        names.remove(0);

        System.out.println(names);

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
       // nameStream.forEach(System.out::println);


    }
}
