package exercises.PB01;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double deposit=Double.parseDouble(scanner.nextLine());
        int period=Integer.parseInt(scanner.nextLine());
        double annualInterestRate= Double.parseDouble(scanner.nextLine());


        double ratePerMonth =(deposit/100*annualInterestRate)/12;
        double sum= deposit+period*ratePerMonth;


        System.out.println(sum);
        //сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

    }
}
