package lab.FirstSteps.Lab06;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner sncanner = new Scanner(System.in);
        int h = 0;
        int m = 0;
        for (h = 0; h <= 23; h++) {
            for (m = 0; m <= 59; m++) {
                System.out.printf("%d:%d\n", h, m);
            }

        }

    }
}
