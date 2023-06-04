package exercises.PB06;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <=9999 ; i++) {

            int currentNumber=i;
            int counter=0;

            for (int j = 0; j <4 ; j++) {
                int lastDigit=currentNumber%10;
                currentNumber/=10;
                if(lastDigit==0){
                    break;
                }
                if(number%lastDigit==0){
                    counter++;
                }
            }
            if(counter==4){
                System.out.println(i+" ");
            }
        }
    }
}
