package com.learnJava.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    public static List<Integer> boxing(){

       return IntStream.rangeClosed(1,10) // intstream of 10 elements
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList){
            //wrapper to primitive
        return integerList.stream()
                //Wrapper Integer Values
                .mapToInt(Integer::intValue) // intstream(intValue of the Wrapper class)
                .sum();


    }

    public static void main(String[] args) {

        System.out.println("Boxing : " + boxing());

        List<Integer> integerList = boxing();
        System.out.println("Unboxing : " + unBoxing(integerList));
    }
}
