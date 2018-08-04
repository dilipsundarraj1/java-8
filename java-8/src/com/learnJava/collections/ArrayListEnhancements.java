package com.learnJava.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ArrayListEnhancements {

    static List<String> names = Arrays.asList("Dave", "Jessie", "Alex", "Dan");


   static void listForEach(){

       for(String s : names){
           System.out.println(s);
       }
       names.forEach((s) -> System.out.println(s));

       names.forEach(s -> System.out.println(s));

   }

    static void replaceAll(){

        for(String s : names){
            System.out.println(s);
        }
    }


    public static void main(String[] args) {


        listForEach();

    }
}
