package com.learnJavaMyVersion.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {
    public static Optional<Student> findAnyStudent(){
       return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }
    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findFirst();
    }
    public static void main(String[] args) {
        Optional<Student> studentOptionalFindAny=findAnyStudent();
        if (studentOptionalFindAny.isPresent()){
            System.out.println("Found the student : "+studentOptionalFindAny.get());
        }else{
            System.out.println("Student not found");
        }
        System.out.println("*******Find First******************");
        Optional<Student> studentOptionalFindFrist=findFirstStudent();
        if (studentOptionalFindFrist.isPresent()){
            System.out.println("Found the student : "+studentOptionalFindFrist.get());
        }else{
            System.out.println("Student not found");
        }

    }
}
