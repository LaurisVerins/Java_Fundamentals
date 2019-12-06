package lverins.javaFundamentals.Date;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime myDate = LocalDateTime.of(2019, Month.NOVEMBER, 01, 22, 35);
        System.out.println(myDate);
        LocalDateTime parseDate =LocalDateTime.parse("2015-02-20T06:30:20");
        System.out.println(parseDate);
        System.out.println(now.plusDays(1));
        System.out.println(now.minusHours(2));
        System.out.println(now.getMonth());



        //now.minusHours(2);
        //now.getMonth();

    }
}
