package com.learnJava.numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1,50);
        System.out.println("Total number of elements : " + intStream.count());
        //intStream.forEach(System.out::print); // stream closed error
        IntStream.range(1,50).forEach(value -> System.out.print(value+","));
        System.out.println();
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));
        System.out.println();
        System.out.println("Total no of elements using rangeClosed :" +IntStream.rangeClosed(1,50).count());

        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));

        //asDoubleStream
        System.out.println();
        LongStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.print(value+","));

    }
}
