package lverins.javaFundamentals.Date;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateExcersise {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("dd.MM.YYYY hh:mm:ss")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("MMM.dd YYYY hh:mm")));

        Date datenow = new Date();
        System.out.println(new SimpleDateFormat("dd.MM.YYYY hh:mm:ss").format(datenow));
        LocalDateTime tomorrow = now.plusDays(1);
        System.out.println(now.isBefore(tomorrow));
        System.out.println(now.isAfter(tomorrow));
        System.out.println(now.isEqual(tomorrow));

        System.out.println(ChronoUnit.DAYS.between(now, tomorrow));
        System.out.printf("%02d.%02d.%02d %02d:%02d:%02d",
                now.getDayOfMonth(),
                now.getMonthValue(),
                now.getYear(),
                now.getHour(),
                now.getMinute(),
                now.getSecond());
        System.out.println();
        System.out.println(tomorrow.truncatedTo(ChronoUnit.DAYS));
        System.out.println(LocalDateTime.of(tomorrow.getYear(),
                tomorrow.getMonth(),
                tomorrow.getDayOfMonth(),0,0, 0));

        System.out.println(LocalDateTime.of(tomorrow.getYear(),
                tomorrow.getMonth(),
                tomorrow.getDayOfMonth(),23,59, 59));

    }
}


        //Print out current date in form of «dd.MM.YYYY hh:mm:ss»
        //LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.YYYY hh:mm:ss"))
        //new SimpleDateFormat("dd.MM.YYYY hh:mm:ss").format(new Date())
        //Compare two different dates
        //Print out «dd.MM.YYYY hh:mm:ss» using System.out.printf
        //Print out beginning of next day.
        //Print out end of next day.
        //Lauris
        ////ajaksjakdj