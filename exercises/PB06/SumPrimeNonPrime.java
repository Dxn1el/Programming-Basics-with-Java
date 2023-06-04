package exercises.PB06;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sumOfNonPrime = 0;
        int sumOfPrime = 0;
        while (!"stop".equals(input)) {

            int number = Integer.parseInt(input);
            boolean isNotPrime = false;
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isNotPrime = true;
                    break;
                }
            }
            if (isNotPrime) {
                sumOfNonPrime += number;
            } else {
                sumOfPrime += number;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", sumOfPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumOfNonPrime);
    }
}
