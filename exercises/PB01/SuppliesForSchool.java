package exercises.PB01;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        int AmountPens=Integer.parseInt(scanner.nextLine());
        int AmountMarkers= Integer.parseInt(scanner.nextLine());
        int AmountDleaning = Integer.parseInt(scanner.nextLine());
        int AmountDiscount = Integer.parseInt(scanner.nextLine());

        double SumPens=AmountPens*5.80;
        double SumMarkers=AmountMarkers*7.20;
        double SumDleaning = AmountDleaning*1.20;
        float SumDiscount = AmountDiscount/100f;
        double FinalSumWithoutDiscount= SumPens+SumMarkers+SumDleaning;


        System.out.println(FinalSumWithoutDiscount-(FinalSumWithoutDiscount*SumDiscount));

    }
}
