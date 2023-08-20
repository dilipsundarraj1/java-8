package com.learnJavaMyVersion.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {
    public static Optional<Integer> limit(List<Integer> list){
        return list.stream()
                .limit(3)
                .reduce((x,y) -> x+y);
    }
    public static Optional<Integer> skip(List<Integer> list){
        return list.stream()
                .skip(3)
                .reduce((x,y) -> x+y);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        Optional<Integer> optional = limit(integerList);
        if (optional.isPresent()){
            System.out.println("The limit result is : "+ optional.get());
        }else{
            System.out.println("No input is passed");
        }
        Optional<Integer> optional2 = limit(new ArrayList<>());
        if (optional2.isPresent()){
            System.out.println("The limit result is : "+ optional2.get());
        }else{
            System.out.println("No input is passed");
        }
        System.out.println("********Skip********");
        Optional<Integer> skip = skip(integerList);
        if (skip.isPresent()){
            System.out.println("The skip result is : "+ skip.get());
        }else{
            System.out.println("No input is passed");
        }

    }
}
