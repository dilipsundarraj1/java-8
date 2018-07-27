package com.learnJava.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes){

        long startTime = System.currentTimeMillis();
        for(int i=0;i<numberOfTimes;i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }



    public static int sumSequentialStream(){

        return IntStream.rangeClosed(1,100000)
                .sum();
    }

    public static int sumParallelStream(){

        return IntStream.rangeClosed(1,100000)
                .parallel() // split the data in to multiple parts
                .sum();
    }

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println("Sequential Stream Result :" +
                checkPerformanceResult(ParallelStreamExample::sumSequentialStream
                        ,20));
        System.out.println("Parallel Stream Result : " +
                checkPerformanceResult(ParallelStreamExample::sumParallelStream
                ,20));


    }
}
