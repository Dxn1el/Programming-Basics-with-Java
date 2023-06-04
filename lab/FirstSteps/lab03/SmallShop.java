package lab.FirstSteps.lab03;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String product =  scanner.nextLine();
        String town = scanner.nextLine();
        double quantity=Double.parseDouble(scanner.nextLine());

        double coffee;
        double water;
        double beer;
        double sweets;
        double peanuts;

        if ("Sofia".equals(town)){
             coffee=0.50;
             water=0.80;
             beer=1.20;
             sweets=1.45;
             peanuts=1.60;
             switch (product){
                 case "coffee" :System.out.println(coffee*quantity);
                 break;
                 case "water" :System.out.println(water*quantity);
                     break;
                 case "beer" :System.out.println(beer*quantity);
                     break;
                 case "sweets" :System.out.println(sweets*quantity);
                     break;
                 case "peanuts" :System.out.println(peanuts*quantity);
                     break;

             }

        }else if("Plovdiv".equals(town)){
            coffee=0.40;
            water=0.70;
            beer=1.15;
            sweets=1.30;
            peanuts=1.50;
            switch (product){
                case "coffee" :System.out.println(coffee*quantity);
                    break;
                case "water" :System.out.println(water*quantity);
                    break;
                case "beer" :System.out.println(beer*quantity);
                    break;
                case "sweets" :System.out.println(sweets*quantity);
                    break;
                case "peanuts" :System.out.println(peanuts*quantity);
                    break;

            }

        }else  {
            coffee=0.45;
            water=0.70;
            beer=1.10;
            sweets=1.35;
            peanuts=1.55;

            switch (product){
                case "coffee" :System.out.println(coffee*quantity);
                    break;
                case "water" :System.out.println(water*quantity);
                    break;
                case "beer" :System.out.println(beer*quantity);
                    break;
                case "sweets" :System.out.println(sweets*quantity);
                    break;
                case "peanuts" :System.out.println(peanuts*quantity);
                    break;

            }
        }

    }
}
