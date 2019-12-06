package lverins.javaFundamentals.Date;

import java.util.Calendar;
import java.util.Date;

public class JavaDateExample {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        long millis = System.currentTimeMillis();
        Date now = new Date(millis);
        System.out.println(now);

        Calendar cal = Calendar.getInstance();
        Date dateFromCalendar = cal.getTime();
        System.out.println(dateFromCalendar);

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE)-33);


        // or123
     //   long millis = System.currentTimeMillis();
     //   Date now = new Date(millis);
     // Wed Mar 13 21:38:09 CET 2019

       // Calendar cal = Calendar.getInstance();
       // Date date = cal.getTime(); // convert Calendar to Date
       // System.out.println(date);  // Wed Mar 13 21:38:09 CET 2019

       // cal.setTime(now);  // convert Date to Calendar
       // System.out.println(cal.get(Calendar.YEAR));          // 2019
       // System.out.println(cal.get(Calendar.DAY_OF_YEAR));   // 72
       // System.out.println(cal.get(Calendar.WEEK_OF_YEAR));  // 11

    }
}
