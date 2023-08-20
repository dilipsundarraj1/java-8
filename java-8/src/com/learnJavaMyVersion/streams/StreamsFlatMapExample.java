package com.learnJavaMyVersion.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities(){

       return  StudentDataBase.getAllStudents().stream()  // Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
               .flatMap(List::stream) //Stream<String>
               .distinct() // removes duplicate
               .sorted() // sort them
                .collect(Collectors.toList());
    }

    public static Long getStudentActivitiesCount(){

        return  StudentDataBase.getAllStudents().stream()  // Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct() // Stream<String> -> with  duplicates removed 
                .count();

    }
    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(getStudentActivitiesCount());
    }
}
