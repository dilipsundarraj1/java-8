package com.learnJava.numericstreams;

import java.util.stream.IntStream;

public class NumericStreamAsExample {

    public static double asDoubleStream(){

    return  IntStream.rangeClosed(1,5)
                .asDoubleStream()
                .sum();
    }


    public static long asLongStream(){
        return  IntStream.rangeClosed(1,5)
                .asLongStream()
                .sum();

    }

    public static void main(String[] args) {

        System.out.println("asDoubleStream :" + asDoubleStream());
        System.out.println("asDoubleStream :" + asLongStream());

    }
}
