package com.learnJava.functionalInterfaces;

public class FunctionExampl1 {

    public static String performConcat(String str) {

        return FunctionExample.addSomeString.apply(str);
    }

    public static void main(String[] args) {

        String result = performConcat("Hello");

        System.out.println("Result : "+ result);

    }
}
