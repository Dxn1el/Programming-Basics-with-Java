package predvaritelenizpit;

import java.util.Scanner;


public class footballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double TshirtPrice = Double.parseDouble(scanner.nextLine());
        double sumForBall = Double.parseDouble(scanner.nextLine());

        double shorts = TshirtPrice * 0.75;
        double socks = shorts * 0.20;
        double shoes = (shorts + TshirtPrice) * 2;
        double sumtotal = TshirtPrice + shoes + shorts + socks;
        double sum = sumtotal - (sumtotal * 0.15);
        double diff = Math.abs(sum - sumForBall);
        if (sum >= sumForBall) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", sum);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", diff);

        }


    }
}

