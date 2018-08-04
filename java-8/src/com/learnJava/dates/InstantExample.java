package com.learnJava.dates;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class InstantExample {

    public static void main(String[] args) {

        Instant instant = Instant.now(); // Represents the date and time in unix timestamp in a machine readable format.
        System.out.println(instant);

        // Interface1 day has 86400 seconds.
        // What is EPOCH ? -> equal to Jan. 1st 1970
        System.out.println("getEpochSecond  : " +instant.getEpochSecond()); //Jan. 1st 1970 -> 0 seconds
        //it does not support any of the methods which represents the time in human readable format.

        Instant instant1  =Instant.ofEpochMilli(0);
        System.out.println("instant1 : " + instant1);

        Instant instant2 = Instant.now();

        Duration duration = Duration.between(instant,instant2);
        System.out.println("getNano : " + duration.getNano());





    }
}
