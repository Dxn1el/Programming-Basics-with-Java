package exercises.PB03;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfProjection=scanner.nextLine();
        int rows =  Integer.parseInt(scanner.nextLine());
        int columns =  Integer.parseInt(scanner.nextLine());
        double income;

        if(typeOfProjection.equals("Premiere")){

            System.out.printf("%.2f leva",columns*rows*12.00);
        }else if (typeOfProjection.equals("Normal")){
            System.out.printf("%.2f leva",columns*rows*7.50);
        } else if (typeOfProjection.equals("Discount")) {
            System.out.printf("%.2f leva",columns*rows*5.00);

        }
    }
}
