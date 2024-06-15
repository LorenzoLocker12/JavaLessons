package dev.lorenzo;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekday = DayOfTheWeek.TUES;
        System.out.println(weekday);

        System.out.printf("Name is %s, Ordinal value is %d%n", weekday.name(), weekday.ordinal());
    }

    public static DayOfTheWeek getRandomDay() {
        int randomIntegers = new Random().nextInt(7);
        var alldays = DayOfTheWeek.values();

        return alldays[randomIntegers];
    }

    public static void switchDayOfWeek(DayOfTheWeek day) {
        int weekDayInteger = day.ordinal() + 1;
        switch(day) {
            case WED -> System.out.println("WED Weekday: is  " + weekDayInteger);
            case SAT-> System.out.println("SAT Weekday is: " + weekDayInteger);
            default -> System.out.println("Weekday: " + weekDayInteger);
        }
    }
}