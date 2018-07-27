package com.learnJava.numericstreams;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumericStreamMapExample {

    public static List<Integer> mapToObj(){

        return IntStream.rangeClosed(1,5)
                .mapToObj((i) -> {
                    return new Integer(i);
                })
                .collect(toList());
    }

    public static long mapToLong(){

        return IntStream.rangeClosed(1,5) // intstream
                //i is passed from the intstream
                .mapToLong((i)->i) // convert intstream to longStream
                .sum();
    }

    public static double mapToDouble(){

        return IntStream.rangeClosed(1,5) // intstream
                //i is passed from the intstream
                .mapToDouble((i)->i) // convert intstream to DoubleStream
                .sum();
    }

    public static void main(String[] args) {

        System.out.println("mapToObj : " + mapToObj());

        System.out.println("mapToLong : " + mapToLong());

        System.out.println("mapToDouble : " + mapToDouble());
    }
}
