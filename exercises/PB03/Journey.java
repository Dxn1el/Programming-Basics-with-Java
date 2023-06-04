package exercises.PB03;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget= Double.parseDouble(scanner.nextLine());
        String season= scanner.nextLine();
        double expensesSummerBulgaria=budget*30/100;
        double expensesWinterBulgaria=budget*70/100;;
        double expensesSummerBalkans=budget*40/100;
        double expensesWinterBalkans=budget*80/100;
        double expensesSummerEurope=budget*90/100;
        String where="";
        String stay="";
        double expenses=0.0;

        if(budget<=100.00){
            where= "Somewhere in Bulgaria ";
            if(season.equals("summer")){
              expenses=expensesSummerBulgaria;
                stay="Camp";
            }else if (season.equals("winter")){
                expenses=expensesWinterBulgaria;
                stay="Hotel";
            }
        } else if (budget<=1000.00) {
            where="Somewhere in Balkans";

            if(season.equals("summer")){
                expenses=expensesSummerBalkans;
                stay="Camp";
            }else if (season.equals("winter")){
                expenses=expensesWinterBalkans;
                stay="Hotel";

            }
        }else if(budget>1000){
            where="Somewhere in Europe";

            if(season.equals("summer")||season.equals("winter")){
                expenses=expensesSummerEurope;
                stay="Hotel";
            }

        }
            System.out.printf("%s",where);
            System.out.printf( "\n%s - %.2f",stay,expenses);

    }
}
