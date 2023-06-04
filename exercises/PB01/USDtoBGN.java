package exercises.PB01;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {


        Scanner scanner =  new Scanner(System.in);

        double bgn = Double.parseDouble(scanner.nextLine());
        double UsdFixedPrice = 1.79549;

        System.out.println(bgn*UsdFixedPrice + "BGN.");
    }
}
