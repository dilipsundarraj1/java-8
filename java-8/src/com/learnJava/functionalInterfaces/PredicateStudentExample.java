package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;

    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        }));


    }
}
