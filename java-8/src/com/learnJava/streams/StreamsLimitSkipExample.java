package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers){
        return integers.stream()
                //6
                //7
                //8
                //9
                //10
                .limit(3) //6,7,8
                .reduce((x,y)->x+y);
    }

    public static Optional<Integer> skip(List<Integer> integers){
        return integers.stream()
                //6
                //7
                //8
                //9
                //10
                .skip(3)//9,10
                .reduce((x,y)->x+y);
    }


    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(6,7,8,9,10);
        /*Optional<Integer> limitResult = limit(integers);
        if(limitResult.isPresent()){
            System.out.println("The limit result is :" + limitResult.get());
        }else{
            System.out.println("No input is passed");
        }
*/
        Optional<Integer> skipResult = skip(integers);
        if(skipResult.isPresent()){
            System.out.println("The skip result is :" + skipResult.get());
        }else{
            System.out.println("No input is passed");
        }

    }
}
