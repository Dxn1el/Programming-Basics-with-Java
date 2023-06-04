package exercises.PB01;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        double lenght=Double.parseDouble(scanner.nextLine());
        double width= Double.parseDouble(scanner.nextLine());
        double height=Double.parseDouble(scanner.nextLine());
        double sand=Double.parseDouble(scanner.nextLine());


        double liters= (lenght*width*height)/1000.0;
        double SandInTheTank= liters*sand/100;

        double result= liters-SandInTheTank;
        System.out.println(result);
    }
}
