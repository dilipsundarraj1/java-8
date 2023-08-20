package com.learnJavaMyVersion.methodreference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
    static Predicate<Student> predicate = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student student){
        return student.getGradeLevel() >=3;
    }

    public static void main(String[] args) {
        System.out.println(predicate.test(StudentDataBase.studentSupplier.get()));

    }
}
