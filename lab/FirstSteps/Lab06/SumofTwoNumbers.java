package lab.FirstSteps.Lab06;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        boolean magicNumberFound = false;

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (magicNumberFound) {
                break;
            }
            for (int j = start; j <= end; j++) {
                count++;

                if ((i + j) == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magicNumber);
                    magicNumberFound = true;
                    break;
                }
            }
        }
        if (!magicNumberFound) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }

    }
}