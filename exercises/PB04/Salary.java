package exercises.PB04;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        String tab ="";
        int leftsum = 0;
        for (int i = 0; i < tabs; i++) {
            tab = scanner.nextLine();
            switch (tab) {

                case "Facebook":
                    leftsum += 150;
                    break;
                case "Instagram":
                    leftsum += 100;
                    break;
                case "Reddit":
                    leftsum += 50;
                    break;
                default:leftsum=leftsum;
            }
        }
        if (salary <= leftsum) {
            System.out.printf("You have lost your salary.");
        } else {
            System.out.println(salary - leftsum);
        }
    }
}
