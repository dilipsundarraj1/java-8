package com.learnJavaMyVersion.imperativeVsDeclarativePrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {
        List<Integer> integersList = Arrays.asList(1,2,3,3,4,5,5,6,7,8,8,9,10);

        /*
        * Imperative
        * */
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer integer : integersList){
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }
        System.out.println("Imperative approach to remove duplicate is : "+uniqueList);

        /*
        * Declarative
        * */

        List<Integer> uniqueList1 = integersList.stream()
                                 .distinct()
                                 .collect(Collectors.toList());
        System.out.println("Declarative Approach to remove duplicate is : "+ uniqueList1);


    }
}
