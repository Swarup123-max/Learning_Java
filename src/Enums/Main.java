package Enums;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Print a custom enum constant
        System.out.println("Custom enum constant: " + Day.friday);

        // Assign enum constants to variables
        Day fday = Day.friday;
        Day mday = Day.monday;

        // Print the name of FRIDAY in uppercase using the name() method
        System.out.println("Uppercase name of FRIDAY: " + fday.name().toUpperCase());

        // Get the ordinal (0-based index) of the enum constant
        int fridayIndex = fday.ordinal();
        System.out.println("Ordinal of FRIDAY: " + fridayIndex);

        // Use a switch expression with enum
        try {
            String result = switch (Day.tuesday) {
                case monday -> "Today is Monday.";
                case tuesday -> "Today is Tuesday.";
                case wednesday -> "Today is Wednesday.";
                case thrusday -> "Today is Thursday.";
                case friday -> "Today is Friday!";
               default -> "It's the weekend!";
             
            };
            System.out.println("Switch result: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Bonus: Use Java's built-in DayOfWeek to print current weekday
        LocalDate today = LocalDate.now();
        DayOfWeek currentDay = today.getDayOfWeek();
        System.out.println("Today is (java.time.DayOfWeek): " + currentDay);
    }
}
