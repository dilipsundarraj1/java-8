package com.learnJava.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1,50).sum();

        System.out.println("Sum is : " + sum);

        OptionalInt optionalInt = IntStream.rangeClosed(0,0).max();

        System.out.println(IntStream.rangeClosed(0,0).count());

        System.out.println(optionalInt.isPresent() ? optionalInt.getAsInt() : 0);

        OptionalLong  optionalLong = LongStream.rangeClosed(50,100).min();

        System.out.println(optionalLong.isPresent() ? optionalLong.getAsLong() : 0);

        OptionalDouble optionalDouble = IntStream.rangeClosed(1,50).average();
        System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0);
    }
}
