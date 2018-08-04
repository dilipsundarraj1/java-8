package com.learnJava.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {


    public static void parseLocalDateTime(){

        String dateTime = "2018-04-18T14:33:33";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("localDateTime1 : " + localDateTime1);

        String dateTime1 = "2018-04-1814|33|33";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-ddHH|mm|ss");
        System.out.println("custom date time format: " + LocalDateTime.parse(dateTime1,dateTimeFormatter));

        String dateTime2 = "2018-04-18abc14|33|33";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");

        System.out.println("custom date time format: " + LocalDateTime.parse(dateTime2,dateTimeFormatter1));

    }

    public static void formatLocalDateTime(){

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String convertedDate = localDateTime.format(dateTimeFormatter1);
        System.out.println("convertedDate : " + convertedDate);
    }


    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();

    }
}
