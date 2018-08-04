package com.learnJava.parallelstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamsBoxedExample {

    public static int sequentialSum(List<Integer> integerList ){

        long start = System.currentTimeMillis();
        int result =  integerList
                .stream()
                .reduce(0,(x,y)-> x+y);
        long duration = System.currentTimeMillis()-start;
        System.out.println("Duration in sequential stream : "+ duration);
        return  result;


    }

    public static int parallelSum(List<Integer> integerList ){

        long start = System.currentTimeMillis();
        int result =  integerList
                .parallelStream()
                .reduce(0,(x,y)-> x+y); // performs unboxing behind the scenes to convert from Integer to int
        long duration = System.currentTimeMillis()-start;
        System.out.println("Duration in parallel stream : "+ duration);
        return  result;


    }

    public static void main(String[] args) {

        List<Integer> integerList = IntStream.rangeClosed(1,1000)
                                    .boxed()
                                    .collect(Collectors.toList());
        sequentialSum(integerList);
        parallelSum(integerList);
    }
}
