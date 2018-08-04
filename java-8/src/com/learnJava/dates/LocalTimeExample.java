package com.learnJava.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(23,33);
        System.out.println(localTime1);

        LocalTime localTime2 = LocalTime.of(22,33,45);
        System.out.println(localTime2);

        /**
         * Getting the values from LocalTime
         */
        System.out.println("Hours " + localTime.getHour());
        System.out.println("Second " + localTime.getSecond());
        System.out.println("Using Get " + localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("toSecondOfDay : "+ localTime.toSecondOfDay());

        /**
         * Modifying the values in Local Time
         */
        System.out.println("modify hours : " + localTime.minusHours(2));
        System.out.println("modify hours using chronoUnit: " + localTime.minus(2,ChronoUnit.HOURS));
        System.out.println("modify using with : " + localTime.with(LocalTime.MIDNIGHT));
        System.out.println("modify using with chrono field: " + localTime.with(ChronoField.HOUR_OF_DAY,22));
        System.out.println("modify hours : " + localTime.plus(2, ChronoUnit.MINUTES));
        System.out.println("modify withHour : " + localTime.withHour(2));

    }
}
