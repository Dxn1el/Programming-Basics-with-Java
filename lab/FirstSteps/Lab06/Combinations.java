package lab.FirstSteps.Lab06;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= number; j++) {
                for (int k = 0; k <= number; k++) {
                    if ((i + k + j) == number) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
