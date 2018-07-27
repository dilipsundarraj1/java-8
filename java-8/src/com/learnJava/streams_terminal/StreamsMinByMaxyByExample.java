package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMinByMaxyByExample {

    public static Optional<Student> minBy_example(){

       return StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxBy_example(){

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {

        System.out.println(minBy_example());
        System.out.println(maxBy_example());
    }
}
