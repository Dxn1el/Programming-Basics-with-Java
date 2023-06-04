package exercises.PB03;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceApartment = 0.0;
        double priceStudio = 0.0;

        switch (month) {
            case "May":
            case "October":
                priceApartment = 65 * nights;
                priceStudio = 50 * nights;
                if (nights > 14) {
                    priceStudio *= 0.70 ;
                } else if(nights>7) {
                    priceStudio *= 0.95;
                }
                break;

            case "June":
            case "September":
                priceApartment = 68.70 * nights;
                priceStudio = 75.20 * nights;
                if (nights > 14) {
                    priceStudio *= 0.80 ;
                }
                break;
            case "July":
            case "August":
                priceApartment = 77.00 * nights;
                priceStudio = 76.00 * nights;
                break;
        }
        if (nights > 14) {
            priceApartment *= 0.90;

        }
        System.out.printf("Apartment: %.2f lv.\n",priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);

    }
}
