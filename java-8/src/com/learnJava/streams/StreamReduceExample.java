package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {


    public static int performMultiplication(List<Integer> integerList){

        return integerList.stream()
                //1
                //3
                //5
                //7
                // a=1,b=1(from stream) => result 1 is returned
                //a=1,b=3(from stream -> result 3 is returned
                //a=3,b=5 (from stream) ->result 15 is retuened
                //a=15, b =7(From stream) -> result 105
                .reduce(1,(a,b) -> a*b);

    }


    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,3,5,7);

    }
}
