package exercises.PB03;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n1= Integer.parseInt(scanner.nextLine());
        int n2= Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        boolean even = true;
        String number ="";
        if ( n2 == 0){
            System.out.printf("Cannot divide %d by zero",n1);
            return;
        }


        switch (operator){
            case "+":
                even = (n1+n2)%2==0;
                number= even ? "even":"odd";
                System.out.println(n1+" + "+n2+" = "+(n1+n2)+" - "+number );
               break;
            case "-":
                 even = (n1-n2)%2==0;
                 number= even ? "even":"odd";
                System.out.println(n1+" - "+n2+" = "+(n1-n2)+" - "+number );
                break;
            case "*":
                even = (n1*n2)%2==0;
                number= even ? "even":"odd";
                System.out.println(n1+" * "+n2+" = "+(n1*n2)+" - "+number );
                break;
            case "/":
                double n3 = n1;
                double n4=n2;
                double delenie = (n3/n4);

                System.out.printf("%d / %d = %.2f",n1,n2,delenie);

                break;
            case "%":

                System.out.println(n1+" % "+n2+" = "+(n1%n2) );
                break;
        }
    }
}
