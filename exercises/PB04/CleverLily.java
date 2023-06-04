package exercises.PB04;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int lillyAge = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double pari = 0.0;
        double igrachki = 0.0;
        int calc = 0;
        for (int i = 1; i <= lillyAge; i++) {

            if (i % 2 == 0) {
                ++calc;
                pari += calc * 10 - 1;
            } else {
                igrachki += 1.0;
            }
        }
        double toysSum = igrachki * toyPrice;
        double savedMoney = toysSum + pari;
        if (savedMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", savedMoney - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", Math.abs(savedMoney - washingMachinePrice));
        }
    }

}
