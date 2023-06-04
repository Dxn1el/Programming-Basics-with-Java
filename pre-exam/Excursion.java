package predvaritelenizpit;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.	Брой екскурзии за море – цяло число в интервала [1… 500]
        //2.	Брой екскурзии за планина – цяло число в интервала [1… 500]
        int seaTrip = Integer.parseInt(scanner.nextLine());
        int mountaintrip = Integer.parseInt(scanner.nextLine());
        int profit = 0;
        //цена 680 лева и планина ("mountain") на цена 499 лева.
        while (true) {
            String where = scanner.nextLine();

            if ("mountain".equals(where)) {

                if (mountaintrip > 0) {
                    mountaintrip--;
                    profit += 499;
                }
            } else if ("Stop".equals(where)) {
                System.out.printf("Profit: %d leva.", profit);
                break;
            } else {
                if (seaTrip > 0) {
                    seaTrip--;
                    profit += 680;
                }
            }
            if (mountaintrip == 0 && seaTrip == 0) {
                System.out.println("Good job! Everything is sold.");
                System.out.printf("Profit: %d leva.", profit);
                break;
            }
        }
    }
}
