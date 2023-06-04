package exercises.PB03;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupbudged = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double boat_rent = 0.0;
        double discount = 0.0;
        double price = 0.0;


        switch (text) {
            case "Spring":
                boat_rent = 3000.0;
                break;
            case "Summer":
            case "Autumn":
                boat_rent = 4200.0;
                break;
            case "Winter":
                boat_rent = 2600.0;
                break;
        }


        if ((fishermen >= 7 && fishermen <= 11)) {
            discount = boat_rent * 15 / 100.0;
        } else if (fishermen <= 6) {
            discount = boat_rent * 10 / 100.0;
        } else if (fishermen > 12) {
            discount = boat_rent * 25 / 100.0;
        }
        price = boat_rent - discount;
        if (fishermen % 2 == 0) {
            price = price - price * 0.05;
        }
        double diff = Math.abs(groupbudged - price);
        boolean result = groupbudged >= price;
        if (result) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}