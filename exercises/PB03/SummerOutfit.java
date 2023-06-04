package exercises.PB03;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temperature = Integer.parseInt(scanner.nextLine());
        String timeOfTheDay = scanner.nextLine();
        String outfit;
        boolean coldy = (temperature >= 10 && temperature <= 18);
        boolean warmy = (temperature > 18 && temperature <= 24);
        boolean hotty = (temperature >= 25);
        String Outfit;
        String Shoes;


        if (timeOfTheDay.equals("Morning")) {
            if (coldy) {
                Outfit = "Sweatshirt";
                Shoes = "Sneakers";
                System.out.printf("It's %d degrees, get your %s and %s.", temperature, Outfit, Shoes);
            } else if (warmy) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", temperature, Outfit, Shoes);
            }else if (hotty) {
                Outfit = "T-Shirt";
                Shoes = "Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.", temperature, Outfit, Shoes);
            }
        } else if (timeOfTheDay.equals("Afternoon")) {
            if (coldy) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", temperature, Outfit, Shoes);
            } else if (warmy) {
                Outfit = "T-Shirt";
                Shoes = "Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.", temperature, Outfit, Shoes);
            } else if (hotty) {
                Outfit = "Swim Suit";
                Shoes = "Barefoot";
                System.out.printf("It's %d degrees, get your %s and %s.", temperature, Outfit, Shoes);
            }
        }else if("Evening".equals(timeOfTheDay)){
                if(coldy||warmy||hotty){
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.", temperature, Outfit, Shoes);

                }
            }

        }
    }


