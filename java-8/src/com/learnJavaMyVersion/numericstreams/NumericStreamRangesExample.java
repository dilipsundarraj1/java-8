package com.learnJavaMyVersion.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {
    public static void main(String[] args) {
        IntStream range = IntStream.range(1, 50);
        System.out.println("Range count : " + range.count());
        IntStream.range(1,50)
                .forEach(value -> System.out.print(value + ", "));
        System.out.println("\n Range closed coutn :" + IntStream.rangeClosed(1,50).count());

        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value + ", "));
        System.out.println("\n Long Stream closed coutn : "+ LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50)
                .forEach(value -> System.out.print(value + ", "));
        System.out.println("\n Ways to achieve InDouble support");
        IntStream.range(1,50)
                .asDoubleStream()
                .forEach(value -> System.out.print(value + ", "));
        System.out.println("\n ");
        IntStream.range(1,50)
                .asLongStream()
                .forEach(value -> System.out.print(value + ", "));


    }
}
