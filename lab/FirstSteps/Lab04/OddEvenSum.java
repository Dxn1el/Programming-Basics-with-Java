package lab.FirstSteps.Lab04;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of numbers you want in the for  loop...");
        int count = Integer.parseInt(scanner.nextLine());
        int oddsuum = 0;
        int evensum = 0;

        for (int i = 1; i <= count; i++) {

            System.out.println("Please enter a value for the number " + (i));
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                evensum += number;
            } else {
                oddsuum += number;
            }
        }
        int diff = Math.abs(evensum - oddsuum);
        if (oddsuum == evensum) {
            System.out.printf("yes - %d", evensum);
        } else {
            System.out.printf("No - %d", diff);

        }
    }

}
