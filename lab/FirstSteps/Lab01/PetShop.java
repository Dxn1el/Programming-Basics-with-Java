package lab.FirstSteps.Lab01;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double DogFood = Double.parseDouble(scanner.nextLine());
        int CatFood = Integer.parseInt(scanner.nextLine());

        double DogFoodPrice = DogFood*2.5;
        int CatFoodPrice = CatFood*4;

        System.out.println(DogFoodPrice + CatFoodPrice + " lv.");

    }
}
