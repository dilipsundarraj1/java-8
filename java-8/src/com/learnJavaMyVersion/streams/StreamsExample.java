package com.learnJavaMyVersion.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        //student name and their activities
        Predicate<Student> studentPredicate =(student -> student.getGradeLevel() >= 3);
        Predicate<Student> studentGpaPredicate =(student -> student.getGpa() >= 3.9);
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek(((student) ->{
                    System.out.println("Before 1st filter "+ student);
                }))
                .filter(studentPredicate) // Stream<Student>
                .peek(((student) ->{
                    System.out.println("After 1st filter "+ student);
                }))
                .filter(studentGpaPredicate)//Stream<Student>
                .peek(((student) ->{
                    System.out.println("After 2 nd filter "+ student);
                }))
                .collect(Collectors.toMap(Student::getName,Student::getActivities)); //Map
        System.out.println(studentMap);
    }
}
