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
        int firstFriday = 5;
        int currentFriday;
            for (currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7){
                    System.out.println("Сегодня пятница, " + currentFriday + "-е число. Необходимо подготовить отчет");
                }

// Task 3
        int cometFlight = 79;
        int year = 2021;
        int yearBefore = year - 200;
        int yearAfter = year + 100;
        for (int q = yearBefore; q <= yearAfter; q ++) {
            if (q % cometFlight == 0) {
                System.out.println(q);
            }
        }

// Task 4
        for (i = 1; i <= 30; i++) {
            System.out.print(i + ": ");
            if (i % 3 == 0) {
                System.out.print("ping ");
            }
            if (i % 5 == 0) {
                System.out.print("pong");
            }
            System.out.println();
        }

// Task 5
        int n0 = 0;
        int n1 = 1;
        for (int q = 1; q < 11; q++){
            System.out.print(n0 + " ");
            n1 = n0 + n1;
            n0 = n1 - n0;
        }
    }
}
