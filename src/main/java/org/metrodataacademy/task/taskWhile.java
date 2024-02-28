package org.metrodataacademy.task;

public class taskWhile {
    public static void doWhile() {
        // Task 6
        int i = 0;
        do {
            System.out.println(i++);
        } while (i < 10);

        // Task 7
        int j = 0;
        while (j < 0) {
            System.out.println(j++);
        }

        // Task 8
        int k = 0;
        while (k < 100) {
            k += 2;
            System.out.println(k);
        }

        // Task 9
        int l = 0;
        while (true) {
            l += 2;
            if (l == 97) {
                break;
            }
            System.out.println(l);
        }

        // Task 10
        int m = 0;
        while (true) {
            m += 2;
            System.out.println(m);
        }
    }
}