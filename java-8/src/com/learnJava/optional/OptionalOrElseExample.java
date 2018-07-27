package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    //orElse

    public static String optionalOrElse(){

       /* Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());*/
        Optional<Student> studentOptional = Optional.ofNullable(null); // Option.empty
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }
    //orElseGet
    public static String optionalOrElseGet(){
        Optional<Student> studentOptional =
                Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseGet(()->"Default");
        return name;

    }

    //orElseThrow
    public static String optionalOrElseThrow(){

        Optional<Student> studentOptional =
                Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName)
                .orElseThrow(()->new RuntimeException("No Data Available"));

        return name;
    }
    public static void main(String[] args) {

        System.out.println("orElse : " + optionalOrElse());
        System.out.println("orElseGet :  " + optionalOrElseGet());
        System.out.println("orElseThrow :  " + optionalOrElseThrow());
    }
}
