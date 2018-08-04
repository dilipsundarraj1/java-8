package com.learnJava.defaults;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {

        Multiplier multiplier = new MultiplierImpl();
        List<Integer> inputList = Arrays.asList(1,3,5);
        System.out.println("Result is : " + multiplier.multiply(inputList));
        System.out.println("Input List size is : " + multiplier.size(inputList));
        System.out.println("Is Empty : " + Multiplier.isEmpty(inputList));

    }
}
