package org.metrodataacademy.task;

public class taskLoop {
    public static void forLoop() {
        // Task 1
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        // Task 2
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
        }

        // Task 3
        for (int i = 1; i > -100; i += 2) {
            System.out.println(i);
        }

        // Task 4
        for (int i = 0; true; i++) {
            if (i == 97) {
                break;
            }
            System.out.println(i);
        }

        // Task 5
        for (int i = 0; true; i += 2) {
            if (i == 97) {
                break;
            }
            System.out.println(i);
        }
    }
}