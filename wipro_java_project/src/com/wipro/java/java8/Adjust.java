package com.wipro.java.java8;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class Adjust {

    // Function to check date and time according to our requirement
    public static void checkingAdjusters() {
        LocalDate date = LocalDate.now();
        System.out.println("Current date is: " + date);

        // Get the first day of next month
        LocalDate firstDayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First day of next month: " + firstDayOfNextMonth);

        // Get the next Saturday
        LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Next Saturday from now is: " + nextSaturday);
    }

    public static void main(String[] args) {
        checkingAdjusters();
    }
}