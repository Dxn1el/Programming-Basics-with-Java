package exercises.PB04;

import java.util.Scanner;

public class NumbersEndingWtth7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 1000; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }

    }
}
