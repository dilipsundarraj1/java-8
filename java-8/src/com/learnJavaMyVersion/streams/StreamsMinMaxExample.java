package com.learnJavaMyVersion.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {
    public static int findMaxValue(List<Integer> integerList){
      return   integerList.stream()
            .reduce(0,(x,y) -> x >y ? x : y);
    }
    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){
        return   integerList.stream()
                .reduce((x,y) -> x >y ? x : y);
    }
    public static int findMinValue(List<Integer> integerList){
        return   integerList.stream()
                .reduce(0,(x,y) -> x < y ? x : y);
    }
    public static Optional<Integer> findMinValueOptional(List<Integer> integerList){
        return   integerList.stream()
                .reduce((x,y) -> x < y ? x : y);
    }
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        int maxValue= findMaxValue(integerList);
        System.out.println("Max value is : "+ maxValue);
        System.out.println("Max value is : "+ findMaxValue(new ArrayList<>()));

        Optional<Integer> optionalInteger = findMaxValueOptional(integerList);
        if (optionalInteger.isPresent()){
            System.out.println("Max value optional : "+ optionalInteger.get());
        }else{
            System.out.println("No max Value found");
        }
        Optional<Integer> optionalInteger2 = findMaxValueOptional(new ArrayList<>());
        if (optionalInteger2.isPresent()){
            System.out.println("Max value optional : "+ optionalInteger.get());
        }else{
            System.out.println("No max Value found");
        }
        //Min
        System.out.println("*************Min****************");
        int minValue= findMinValue(integerList);
        System.out.println("Min value is : "+ minValue);
        System.out.println("Min value is : "+ findMinValue(new ArrayList<>()));

        Optional<Integer> optionalMin= findMinValueOptional(integerList);
        if (optionalMin.isPresent()){
            System.out.println("Min value optional : "+ optionalMin.get());
        }else{
            System.out.println("No Min Value found");
        }
        Optional<Integer> optionalMin2 = findMinValueOptional(new ArrayList<>());
        if (optionalMin2.isPresent()){
            System.out.println("Min value optional : "+ optionalMin2.get());
        }else{
            System.out.println("No Min Value found");
        }


    }
}
