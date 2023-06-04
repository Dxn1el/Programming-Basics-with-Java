package lab.FirstSteps.Lab04;

import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            leftSum += number;

        }
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            rightSum += number;
        }
        int diff = Math.abs(leftSum - rightSum);
        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d ", leftSum);
        } else {
            System.out.printf("No, diff = %d ", diff);
        }
    }
}
