package datedemo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateDemo2 {
    public static void main(String[] args) {
        DateDemo2();
    }

    static void OwnDate() {
        String day;
        String Month;
        String Year;
        System.out.println("Enter the day:");
        day = System.console().readLine();

        System.out.println("Enter the month:");
        Month = System.console().readLine();

        System.out.println("Enter the year:");
        Year = System.console().readLine();

        System.out.println("You were born on;"
                + LocalDate.of(Integer.parseInt(Year), Integer.parseInt(Month), Integer.parseInt(day)));

    }

    static void DateDemo2() {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);
        System.out.println(today.getDayOfWeek());

        System.out.println("Tomorrow:" + today.plusDays(1));
        System.out.println(today.plusDays(1).getDayOfWeek());

        System.out.println("Yesterday:" + today.minusDays(1));
        System.out.println(today.minusDays(1).getDayOfWeek());

        System.out.println("Next week" + today.plusWeeks(1));
        System.out.println(today.plusWeeks(1).getDayOfWeek());

    }

}
