package com.learnJavaMyVersion.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void  nameAndActivities(){
        System.out.println("******  Inside nameAndActivities() method **********");
        BiConsumer<String,List<String>> biConsumer = (name,activities) -> System.out.println(name +" : "+ activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student) -> biConsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer <String,String> biConsumer = (a,b) ->{
            System.out.println("a: "+ a +", b: "+ b);
        };
        BiConsumer<Integer,Integer> multiplication = (a,b) ->{
            System.out.println("Multiplication:  "+ a*b);
        };
        BiConsumer<Integer,Integer> division = (a,b) ->{
            System.out.println("division:  "+ a/b);
        };

        biConsumer.accept("Java7","Java8");
        multiplication.andThen(division).accept(10,5);

        nameAndActivities();
    }
}
