package com.learnJava.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormattingLocalTimeExample {

    public static void parseTime(){

        /**
         * System defined format
         */
        String time = "13:00";
        LocalTime localTime = LocalTime.parse(time);
        System.out.println("localTime : " + localTime);

        LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_TIME);
        System.out.println("localTime1 : " + localTime1);

        //H -> 24 hour time format
        //h-> 12 hour time format
        String time1 = "13*00";
        DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("HH*mm");
        LocalTime localTime2 = LocalTime.parse(time1,dateTimeFormatter);
        System.out.println("localTime2 : " + localTime2);

        String time2 = "13*00*33";
        DateTimeFormatter dateTimeFormatter1 =DateTimeFormatter.ofPattern("HH*mm*ss");
        LocalTime localTime3= LocalTime.parse(time2,dateTimeFormatter1);
        System.out.println("localTime3 : " + localTime3);



    }

    public static void formatTime(){

        LocalTime localTime = LocalTime.of(19,30);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String time = dateTimeFormatter.format(localTime);
        System.out.println("time : " + time);

        LocalTime localTime1 = LocalTime.of(19,30,45);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH*mm*ss");
        String time1 = dateTimeFormatter1.format(localTime1);
        System.out.println("time1 : " + time1);

    }

    public static void main(String[] args) {
        parseTime();
        formatTime();

    }
}
