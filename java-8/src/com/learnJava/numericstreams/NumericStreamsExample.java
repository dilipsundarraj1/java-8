package com.learnJava.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {


    public static int sumOfNumbers(List<Integer> integerList){

       return  integerList.stream() // Stream<Integer>
                .reduce(0,(x,y)->x+y); // unboxing to convert Integer to an int.

    }

    public static int sumOfNumbersIntStream(){

        return IntStream.rangeClosed(1,6)
                .sum(); //saves the unboxing effort.

    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        System.out.println("Sum of numbers are : " + sumOfNumbers(integerList));

        System.out.println("Sum of numbers using IntStream are : " + sumOfNumbersIntStream());
    }
}
