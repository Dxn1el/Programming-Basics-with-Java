package lab.FirstSteps.lab03;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String thingy= scanner.nextLine();
        String Day=scanner.nextLine();
        double quantity= Double.parseDouble(scanner.nextLine());
        double banana;
        double apple;
        double orange;
        double grapefruit;
        double kiwi;
        double pineapple;
        double grapes;
        if(Day.equals("Monday") ||Day.equals("Tuesday")||Day.equals("Wednesday") ||Day.equals("Thursday")||Day.equals("Friday")){
             banana=2.50;
             apple=1.20;
             orange=0.85;
             grapefruit=1.45;
             kiwi=2.70;
             pineapple=5.50;
             grapes=3.85;
            switch (thingy){
                case "banana":
                    System.out.printf("%.2f",banana*quantity);
                    break;
                case "apple":
                    System.out.printf("%.2f",apple*quantity);
                    break;
                case "orange":
                    System.out.printf("%.2f",orange*quantity);
                    break;
                case "grapefruit":
                    System.out.printf("%.2f",grapefruit*quantity);
                    break;
                case "kiwi":
                    System.out.printf("%.2f",kiwi*quantity);
                    break;
                case "pineapple":
                    System.out.printf("%.2f",pineapple*quantity);
                    break;
                case "grapes":
                    System.out.printf("%.2f",grapes*quantity);
                    break;
                default:
                    System.out.println("error");
            }
        }else if (Day.equals("Saturday")||Day.equals("Sunday")) {

             banana=2.70;
             apple=1.25;
             orange=0.90;
             grapefruit=1.60;
             kiwi=3.00;
             pineapple=5.60;
             grapes=4.20;

            switch (thingy){
                case "banana":
                    System.out.printf("%.2f",banana*quantity);
                    break;
                case "apple":
                    System.out.printf("%.2f",apple*quantity);
                    break;
                case "orange":
                    System.out.printf("%.2f",orange*quantity);
                    break;
                case "grapefruit":
                    System.out.printf("%.2f",grapefruit*quantity);
                    break;
                case "kiwi":
                    System.out.printf("%.2f",kiwi*quantity);
                    break;
                case "pineapple":
                    System.out.printf("%.2f",pineapple*quantity);
                    break;
                case "grapes":
                    System.out.printf("%.2f",grapes*quantity);;
                    break;
                default:
                    System.out.println("error");
            }
        }else {
            System.out.println("error");
        }


    }
}
