package exercises.PB04;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        double p4 = 0.0;
        double p5 = 0.0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                p1 = p1 + 1;
            } else if (number <= 399) {
                p2 += 1;
            } else if (number <= 599) {
                p3 += 1;
            } else if (number <= 799) {
                p4 += 1;
            } else {
                p5 += 1;
            }
        }
        p1 = p1 / n * 100.0;
        p2 = p2 / n * 100.0;
        p3 = p3 / n * 100.0;
        p4 = p4 / n * 100.0;
        p5 = p5 / n * 100.0;

        System.out.printf("%.02f%% %n", p1);
        System.out.printf("%.02f%% %n", p2);
        System.out.printf("%.02f%% %n", p3);
        System.out.printf("%.02f%% %n", p4);
        System.out.printf("%.02f%% %n", p5);

    }
}
