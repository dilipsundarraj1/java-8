package com.learnJava.streams_terminal;


import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamsJoiningExample {

    public static String joining_1(){

       return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)//<Stream<String>>
                .collect(joining());
    }

    public static String joining_2(){

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)//<Stream<String>>
                .collect(joining("-"));
    }

    public static String joining_3(){

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)//<Stream<String>>
                .collect(joining("-","(",")"));
    }

    public static void main(String[] args) {

        System.out.println("joining_1 : " + joining_1());

        System.out.println("joining_2 : " + joining_2());

        System.out.println("joining_3 : " + joining_3());
    }
}
