package lab.FirstSteps.lab03;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean toOneHundred=number>=-100 && number<=100;
        boolean diffThanZero= number !=0;

        if(toOneHundred && diffThanZero){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
