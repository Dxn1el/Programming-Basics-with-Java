package exercises.PB05;

import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double coins = Double.parseDouble(scanner.nextLine());
        coins = coins * 100;
        int countCoins = 0;

        while (coins > 0) {

            if (coins >= 200) {
                coins -= 200;
                countCoins++;
            } else if (coins >= 100) {
                coins -= 100;
                countCoins++;
            } else if (coins >= 50) {
                coins -= 50;
                countCoins++;
            } else if (coins >= 20) {
                coins -= 20;
                countCoins++;
            } else if (coins >= 10) {
                coins -= 10;
                countCoins++;
            } else if (coins >= 5) {
                coins -= 5;
                countCoins++;
            } else if (coins >= 2) {
                coins -= 2;
                countCoins++;
            } else if (coins >= 1) {
                coins -= 1;
                countCoins++;
            }

        }
        System.out.println(countCoins);

    }
}
