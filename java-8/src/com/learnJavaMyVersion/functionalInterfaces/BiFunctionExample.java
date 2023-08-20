package com.learnJavaMyVersion.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;
import com.oracle.tools.packager.mac.MacAppBundler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction =((studentList, studentPredicate) -> {
        Map<String,Double> studentGpaMap = new HashMap<>();
        studentList.forEach(student -> {
            if (studentPredicate.test(student)){
                studentGpaMap.put(student.getName(),student.getGpa());
            }
        });
        return studentGpaMap;
    });
    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentExample.predicate));
    }
}
