package com.learnJava.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime :" + localDateTime);
        LocalDateTime localDateTime1  = LocalDateTime.of(2018, 01,01,12,10,00);
        System.out.println("localDateTime1 : " + localDateTime1);

        /**
         * Getting the Values
         */
        System.out.println("getMinute : " + localDateTime.getMinute());
        System.out.println("getHour : " + localDateTime.getHour());
        System.out.println("DAY_OF_MONTH : " + localDateTime.get(ChronoField.DAY_OF_MONTH));

        /**
         *  Modifying the values in Local Time
         */
        System.out.println("plusDays : " + localDateTime.plusDays(2));
        System.out.println("minusDays : " + localDateTime.minusDays(2));
        System.out.println("withMonth : " + localDateTime.withMonth(2));
        System.out.println("with : " + localDateTime.with(ChronoField.MONTH_OF_YEAR,3));
        System.out.println("firstDayOfNextMonth : " + localDateTime.with(TemporalAdjusters.firstDayOfNextMonth()));



        /**
         * Converting LocalDate,LocalTime to LocalDateTime and vice versa
         */

        LocalDate localDate = LocalDate.now();
        System.out.println("atTime : "+ localDate.atTime(23,30));

        LocalTime localTime = LocalTime.now();
        System.out.println("atTime : "+ localTime.atDate(localDate));
        System.out.println("atStartOfDay : " + localDate.atStartOfDay());

        System.out.println("toLocalDate : " + localDateTime.toLocalDate());;
        System.out.println("toLocalTime : " + localDateTime.toLocalTime());;


    }
}
