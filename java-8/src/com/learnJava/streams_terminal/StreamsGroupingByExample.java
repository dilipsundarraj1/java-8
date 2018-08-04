package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    public static void groupingByGender(){

        Map<String,List<Student>> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));

        Stream.of(studentMap).forEach(System.out::println);
    }

    public  static void customizedGroupingBy(){

        Map<String,List<Student>> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa()>= 3.8 ?  "OUTSTANDING" : "AVERAGE"));

        Stream.of(studentMap).forEach(System.out::println);
    }

    /**
     * Grouping by Two parameters
     */
    public  static void twoLevelGrouping(){

        Map<Integer,  Map<String,List<Student>>> studentMap =  StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa()>= 3.8 ?  "OUTSTANDING" : "AVERAGE")));

        Stream.of(studentMap).forEach(System.out::println);

    }

    /**
     * Grouping by Two parameters
     */
    public  static void twoLevelGrouping_2(){

        Map<String,Integer> nameNoteBooksMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNoteBooks)));// second argument can be of any type of collector

        System.out.println(nameNoteBooksMap);
    }

    /**
     * Grouping by Two parameters
     */
    public  static void twoLevelGrouping_3(){

        Map<String,Set<Student>> nameNoteBooksMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName,
                        toSet()));// second argument can be of any type of collector

        System.out.println(nameNoteBooksMap);
    }


    public static void threeArgumentGroupingBy(){

        LinkedHashMap<String,Set<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName,LinkedHashMap::new,
                        toSet()));

        System.out.println(" studentMap : " + studentMap);
    }


    public  static void calculteTopGpaStudentinEachGrade(){

        Map<Integer, Optional<Student>> studentMapOptional =  StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,maxBy(Comparator.comparingDouble(Student::getGpa))
                ));

        Stream.of(studentMapOptional).forEach(System.out::println);


        Map<Integer, Student> studentMap =  StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparingDouble(Student::getGpa))
                        ,Optional::get
                )));

        Stream.of(studentMap).forEach(System.out::println);
    }

    public  static void calculteleastGpaStudentinEachGrade(){

        Map<Integer, Optional<Student>> studentMapOptional =  StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,minBy(Comparator.comparingDouble(Student::getGpa))
                ));

        Stream.of(studentMapOptional).forEach(System.out::println);


        Map<Integer, Student> studentMap =  StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparingDouble(Student::getGpa))
                                ,Optional::get
                        )));

        Stream.of(studentMap).forEach(System.out::println);
    }

    public static void main(String[] args) {

        //groupingByGender();
        //groupByGrade();
        twoLevelGrouping();
        //twoLevelGrouping_2();
        //twoLevelGrouping_3();
        //calculteTopGpaStudentinEachGrade();
        //calculteleastGpaStudentinEachGrade();
       // threeArgumentGroupingBy();
    }
}
