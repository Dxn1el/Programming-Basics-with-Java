package lab.FirstSteps.Lab04;

import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            result += number;

        }
        System.out.println(result);
    }
}
