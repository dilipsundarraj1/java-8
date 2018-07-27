package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){

        //Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if(student!=null){
            return student.getName();
        }

        return null;
    }

    public static Optional<String> getStudentNameOptional(){

        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null); // Optional.empty()
        if(studentOptional.isPresent()){
            studentOptional.get(); //Student
            return studentOptional.map(Student::getName); //Optional<String>
        }

        return Optional.empty(); // Represents an optional object with no value
    }

    public static void main(String[] args) {

        /*String name = getStudentName();
        if(name!=null)
            System.out.println("Length of the student Name : " + name.length());
        else
            System.out.println("Name not found");*/

        Optional<String> stringOptional = getStudentNameOptional();

        if(stringOptional.isPresent()){
            System.out.println("Length of the student Name : " +
                    stringOptional.get().length()); //String which is Student Name
        }else{
            System.out.println("Name not found");
        }

    }
}
