package com.learnJavaMyVersion.imperativeVsDeclarativePrograming;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

    public static void main(String[] args) {

        /*
        * Imperative - How style programming
         */

        int sum =0;
        for(int i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println("Sum using imperative Approach   is : "+ sum);

        /*
        * Declarative - What style programming
        *
        * */

        int sum1 = IntStream.rangeClosed(0, 100)
                .sum();
        System.out.println("Sum using declarative Approach is : "+ sum1);
    }
}
