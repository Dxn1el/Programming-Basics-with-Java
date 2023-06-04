package lab.FirstSteps.lab03;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        boolean x = number==0 || number>=100 && number <=200  ;
        if(!x){
            System.out.println("invalid");
        }
    }
}
