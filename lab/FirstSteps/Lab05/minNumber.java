package lab.FirstSteps.Lab05;

import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int minimum = Integer.MAX_VALUE;
        while (!"Stop".equals(input)) {
            int number = Integer.parseInt(input);
            if (number < minimum) {
                minimum = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(minimum);
    }
}
