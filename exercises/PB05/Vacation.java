package exercises.PB05;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double neededMoney = Double.parseDouble(scanner.nextLine());
        double moneyInHand = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int spenddays = 0;

        while (true) {
            days++;
            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            switch (action) {
                case "save":
                    moneyInHand += sum;
                    spenddays = 0;
                    break;
                case "spend":
                    moneyInHand -= sum;
                    if (moneyInHand <= 0) {
                        moneyInHand = 0;
                    }
                    spenddays++;

                    break;
            }
            if (moneyInHand >= neededMoney) {
                System.out.printf("You saved the money for %d days.", days);
                break;
            }
            if (spenddays == 5) {
                System.out.println("You can't save the money.");
                System.out.println(days);
                break;
            }


        }
    }
}
