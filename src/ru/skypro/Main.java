package ru.skypro;

import java.sql.SQLOutput;

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

// Task 4
        for (i = 1; i <= 30; i++) {
            System.out.print(i + ": ");
            if (i % 3 == 0) {
                System.out.print("ping ");
            }
            if (i % 5 == 0) {
                System.out.print("pong ");
            }
            System.out.println(" ");
        }

// Task 5
        int n0 = 0;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (i = 1; i < 9; i++){
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }
}
