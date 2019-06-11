package com.learnJava.qAnda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsQuestion2 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        List<Integer> intList =  Arrays.asList(1,2,3,4,3,2,3,5,6,6,7,3,4);
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer num:intList){
            if(!uniqueList.contains(num)){
                uniqueList.add(num);
            }
        }

        long end = System.currentTimeMillis();



        System.out.println("Distinct list : "+uniqueList+" Time Taken : "+(end-start)+" ms");

        long start1 = System.currentTimeMillis();

        List<Integer> uniqueListLam = intList.stream().parallel().distinct().collect(Collectors.toList());

        long end1 = System.currentTimeMillis();

        System.out.println(uniqueListLam+" Time Taken : "+(end1-start1)+" ms");
    }
}
