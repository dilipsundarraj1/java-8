package com.learnJavaMyVersion.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {
    static  int anotherValue=10;
    public static void main(String[] args) {
        int value = 4; //local variable
        Consumer<Integer> consumer =(i) -> {
           // value++; not possible
            anotherValue ++; // this possible
            System.out.println(value + i);
            System.out.println(anotherValue + i);
        };
       // value =8; // not possible
        anotherValue=11; // possible
        consumer.accept(4);

    }
}
