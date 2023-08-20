package com.learnJavaMyVersion.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> predicate = (student) -> student.getGradeLevel() >=3;
    static Predicate<Student> predicate2 = (student) -> student.getGpa() >=3.9;
    public static void filterStudentByGradeLevel(){
        System.out.println("***********Inside filterStudentByGradeLevel() method*****************");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student) ->{
            if(predicate.test(student)){
                System.out.println(student);
            }
        });
    }
    public static void filterStudentByGpa(){
        System.out.println("***********Inside filterStudentByGpa() method*****************");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student) ->{
            if(predicate2.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudents(){
        System.out.println("***********Inside filterStudents() method*****************");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student) ->{
            if(predicate.and(predicate2).test(student)){
                System.out.println(student);
            }
        });
    }
    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudents();
    }
}
