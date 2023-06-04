package exercises.PB01;

import java.util.Scanner;

public class RadianstoDegrees {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        double radiant = Double.parseDouble(scanner.nextLine());
        double degrees = 180* radiant / Math.PI;


        System.out.println(degrees);


    }
}
