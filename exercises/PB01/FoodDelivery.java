package exercises.PB01;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double OrderedChicken=Double.parseDouble(scanner.nextLine());
        double OrderedFishMenu=Double.parseDouble(scanner.nextLine());
        double OrderedVeganMenu=Double.parseDouble(scanner.nextLine());

        double ChickenMenu= 10.35;
        double FishMenu= 12.40;
        double VeganMenu= 8.15;

        double sumChicken=ChickenMenu*OrderedChicken;
        double sumFishMenu=FishMenu*OrderedFishMenu;
        double sumVeganMenu=VeganMenu*OrderedVeganMenu;
        double dessert= (sumChicken+sumFishMenu+sumVeganMenu)*0.2;

        float deliveryFee=2.5f;

        double result = sumChicken+sumFishMenu+sumVeganMenu+dessert+deliveryFee;
        System.out.println(result);

    }
}
