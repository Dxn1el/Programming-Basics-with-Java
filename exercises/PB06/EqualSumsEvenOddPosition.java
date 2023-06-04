package exercises.PB06;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {

            int currentNum = i;
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 6; j > 0; j--) {
                int lastDigit = currentNum % 10;
                currentNum /= 10;
                if (j % 2 == 0) {
                    evenSum += lastDigit;
                } else {
                    oddSum += lastDigit;
                }
            }

            if (oddSum == evenSum) {
                System.out.print(i + " ");
            }
        }
    }
}
