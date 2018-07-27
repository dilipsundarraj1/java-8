package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsMappingExample {

    public static void main(String[] args) {


        List<String> namesList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList()));

        System.out.println("namesList : " + namesList);

        Set<String> namesSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toSet()));

        StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toList());
        System.out.println("namesSet : " + namesSet);

    }
}
