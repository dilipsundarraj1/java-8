package com.learnJavaMyVersion.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {
    public static void main(String[] args) {
        int i=0;
        Consumer<Integer> consumer =(i1) -> { // not possible to use variable i in the parameter value
           // int i=2; -> not possible
            System.out.println("Value is : "+ i1);
        };
    }
}
