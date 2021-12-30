package ru.skypro;

public class Main {

    public static void main(String[] args) {
// Task 1
        int i = 1;
        int j;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;

        }
        System.out.println();
        for (j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
// Task 2
        int dayReport = 5;
        int dayWeek;
        int numberDay = 1;
        while (numberDay <= 31) {
            for (dayWeek = 1; dayWeek <= 7; dayWeek++) {
                if (dayWeek % dayReport == 0 && numberDay < 31) {
                    System.out.println("Сегодня пятница, " + numberDay + "-е число. Необходимо подготовить отчет");
                }
                numberDay++;
            }
        }

// Task 3
        int cometFlight = 79;
        int year = 2021;
        int yearBefore = year - 200;
        int yearAfter = year + 100;
        for (i = 0; i < yearAfter; i += cometFlight) {
            if (i > yearBefore) {
                System.out.println(i);
            }
        }

    }
}
