package com.learnJava.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable(){

        Optional<String> stringOptional =Optional.ofNullable("Hello");
        return stringOptional;
    }


    public static Optional<String> of(){

        Optional<String> stringOptional =Optional.of("Hello");
        return stringOptional;
    }

    public static Optional<String> empty(){

        return Optional.empty();
    }

    public static void main(String[] args) {

        System.out.println("OfNUllable : " + ofNullable());
        System.out.println("of : " + of());
        System.out.println("empty : " + empty());
    }
}
