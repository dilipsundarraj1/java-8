package com.learnJava.qAnda;

import com.learnJava.data.Student;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class StudentsQuestion1 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Zohne", "Redy", "Zohne", "Redy", "Stome","Redy");

        System.out.println(words.stream()
                .collect(groupingBy(s->s,counting()))
        .entrySet().stream().max(((o1, o2) -> o1.getValue() > o2.getValue() ? 1 : -1)).get().getKey());

        System.out.println(words.stream()
                .collect(groupingBy(s->s,counting()))
                .entrySet().stream().min(((o1, o2) -> o1.getValue() > o2.getValue() ? 1 : -1)).get().getKey());



        Map<String, Long> frequentChars = words.stream()
                .collect(groupingBy(Function.identity(),counting()));


        System.out.println(frequentChars);


    }


}
