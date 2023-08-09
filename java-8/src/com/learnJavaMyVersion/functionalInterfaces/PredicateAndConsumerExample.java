package com.learnJavaMyVersion.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> predicate1 = (student) -> student.getGradeLevel() >= 3;
    Predicate<Student> getPredicate2 = (student) -> student.getGpa() >= 3.9;
    BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa)-> gradeLevel >= 3 && gpa >= 3.9;
    BiConsumer<String,List<String>> studentBiConsumer = (name,activities) -> System.out.println(name +" : "+ activities);
    Consumer<Student> studentConsumer = (student -> {
     // if(predicate1.and(getPredicate2).test(student)){ //using Predicate chaining
        if(biPredicate.test(student.getGradeLevel(),student.getGpa())){ // using biPredicate
          studentBiConsumer.accept(student.getName(),student.getActivities());
      }
    });

    public  void  printNameAndActivities(List<Student> studentList){
        System.out.println("****************InSide  printNameAndActivities() method******************");
        studentList.forEach(studentConsumer);
    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }
}
