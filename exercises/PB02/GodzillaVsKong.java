package exercises.PB02;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double ClothingPrice= Double.parseDouble(scanner.nextLine());

        double decor = budget*10/100;
        if(statist>150){
            ClothingPrice= ClothingPrice-ClothingPrice*10/100;
        }

        double Expenses= statist*ClothingPrice+decor;



        if (Expenses>budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",Expenses-budget);
        }else if (Expenses<=budget){
            System.out.println(" Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget-Expenses);
        }
    }

}
