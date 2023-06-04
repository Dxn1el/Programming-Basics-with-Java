package exercises.PB01;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double OneYearPrice=Double.parseDouble(scanner.nextLine());

        double Jordans=OneYearPrice-OneYearPrice*0.4;
        double Suit=Jordans-Jordans*0.2;
        double Ball=Suit*0.25;
        double Accesoaries=Ball*0.20;

        double sum= OneYearPrice+Jordans+Suit+Ball+Accesoaries;

        System.out.println(sum);


    }
}
