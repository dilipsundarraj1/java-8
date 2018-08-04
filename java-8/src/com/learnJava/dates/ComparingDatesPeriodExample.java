package com.learnJava.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class ComparingDatesPeriodExample {

    public static void main(String[] args) {

        LocalDate  localDate = LocalDate.of(2018,01,01);
        LocalDate  localDate1 = LocalDate.of(2018,12,31);

        /**
         * until - Period
         */
        Period period = localDate.until(localDate1);
        System.out.println("getDays : " + period.getDays()); // results in 30 days performs (31-1)
        System.out.println("getMonths : " + period.getMonths()); // results in 0 days (12-01)

        Period period1 = Period.ofDays(10);
        System.out.println("getDays : " + period1.getDays());
        Period period2 = Period.ofYears(20);
        System.out.println("getYears : " + period2.getYears());
        System.out.println("toTotalMonths : " + period2.toTotalMonths());
        System.out.println("getDays : " + period2.getDays());



        Period period3 = Period.between(localDate, localDate1);
        System.out.println("getDays : " +period3.getDays());
        System.out.println("getMonths : " +period3.getMonths());
        System.out.println("getYears : " +period3.getYears());



    }
}
