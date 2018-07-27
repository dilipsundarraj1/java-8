package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;

    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    public static void filterStudentsByGradeLevel(){

        System.out.println("filterStudentsByGradeLevel :");

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> {

            if(p1.test(student)){ //s.getGradeLevel()>=3;
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentsByGpa(){

        System.out.println("filterStudentsByGpa :");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> {

            if(p2.test(student)){ //s.getGpa()>=3.9;
                System.out.println(student);
            }
        }));
    }

    public static void filterStudents(){

        System.out.println("filterStudents :");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> {

            if(p1.or(p2).negate().test(student)){//s.getGradeLevel()>=3; s.getGpa()>=3.9;
                System.out.println(student);
            }else{
                System.out.println(student);
            }
        }));
    }

    public static void main(String[] args) {

        filterStudentsByGradeLevel();

        filterStudentsByGpa();

        filterStudents();

    }
}
