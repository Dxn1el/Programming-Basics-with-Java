package exercises.PB04;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how much numbers you want to put in the cycle");
        int n = Integer.parseInt(scanner.nextLine());
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter value for number" + (i+1));
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > maxValue) {
                maxValue = number;
            }

        }
        sum -= maxValue;

        if (sum == maxValue) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxValue - sum));
        }
    }
}
