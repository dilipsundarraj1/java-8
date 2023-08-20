package com.learnJavaMyVersion.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {


        /*
        * Prior to Java 8
        * */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o1.compareTo(o2);
            }
        };
        System.out.println("The Result of Comparator is : "+ comparator.compare(3,2));

        /*
        * Java 8
        * */
        Comparator<Integer> comparatorLambda = ( a,  b) -> a.compareTo(b);
        System.out.println("The Result of Comparator using Lambdas is : "+ comparatorLambda.compare(3,2));
    }
}
