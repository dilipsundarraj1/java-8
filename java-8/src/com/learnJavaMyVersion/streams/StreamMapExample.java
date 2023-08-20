package com.learnJavaMyVersion.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static List<String> namesList(){
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                //Student as an input -> Student name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
                .collect(Collectors.toList()); //List<String>
    }
    public static Set<String> namesSet(){
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                //Student as an input -> Student name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
                .collect(Collectors.toSet()); //Set<String>
    }
    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
