package exercises.PB02;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int bought_GPU = Integer.parseInt(scanner.nextLine());
        int bought_CPU = Integer.parseInt(scanner.nextLine());
        int bought_RAM = Integer.parseInt(scanner.nextLine());

        double price_GPU =250*bought_GPU;
        double price_CPU=(price_GPU*0.35)*bought_CPU;
        double price_RAM=(price_GPU*0.10)*bought_RAM;


        double total= price_CPU+price_GPU+price_RAM;


        if(bought_GPU>bought_CPU){
            total= total-(total*15/100);
        }


        double diff =  Math.abs(budget-total);
        if(budget>=total){
            System.out.printf("You have %.2f leva left!",diff);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!",diff);
        }


    }
}
