package com.learnJavaMyVersion.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static  Consumer <String> c1 = (s )-> System.out.println(s.toUpperCase());
    static Consumer <Student> c2 = (student) -> System.out.println(student);
    static Consumer <Student> c3 = (student) -> System.out.println(student.getName());
    static  Consumer <Student> c4 = (student) -> System.out.println(student.getActivities());
    public static void  printName(){
        System.out.println("********Inside printName() method  *****************");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }
    public  static void printNameAndActivities(){
        System.out.println("********Inside printNameAndActivities() method  *****************");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4));
    }

    public  static void printNameAndActivitiesWtihCondition(){
        System.out.println("********Inside printNameAndActivitiesWtihCondition() method  *****************");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(((student) ->{
            if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9)
                c3.andThen(c4).accept(student);
        } ));
    }
    public static void main(String[] args) {



       c1.accept("Tiedros");
       printName();
        printNameAndActivities();
        printNameAndActivitiesWtihCondition();
    }
}
