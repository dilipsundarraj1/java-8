package com.learnJava.parallelstream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintStudentActivities(){

        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String> - stateless
                .flatMap(List::stream) //Stream<String> - stateless
                .distinct() // stateful
                .sorted() //stateful
                .collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequential : "+ (endTime-startTime));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities(){

        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream() //Stream<Student>
                .parallel()
                .map(Student::getActivities) //Stream<List<String> - stateless
                .flatMap(List::stream) //Stream<String> - stateless
                .distinct() // stateful
                .sorted() //stateful
                .collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in parallel : "+ (endTime-startTime));
        return studentActivities;
    }

    public static void main(String[] args) {

        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
}
