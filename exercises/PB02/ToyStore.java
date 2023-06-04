package exercises.PB02;

import java.util.Scanner;

public class ToyStore {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        double PuzzlePrice= 2.60;
        double TalkingDollPrice= 3.0;
        double TeddyBearPrice= 4.10;
        double MinionPrice=8.20;
        double TruckPrice= 2.0;

        double TripPrice= Double.parseDouble(scanner.nextLine());
        int Puzzles= Integer.parseInt(scanner.nextLine());
        int TalkingDolls= Integer.parseInt(scanner.nextLine());
        int TeddyBears= Integer.parseInt(scanner.nextLine());
        int Minions= Integer.parseInt(scanner.nextLine());
        int Trucks= Integer.parseInt(scanner.nextLine());
        int totalToys = Puzzles+TalkingDolls+TeddyBears+Minions+Trucks;

       double totalPrice = (Puzzles * PuzzlePrice) + (TalkingDolls * TalkingDollPrice) + (Minions * MinionPrice) + (Trucks * TruckPrice)+(TeddyBears*TeddyBearPrice);


       if(totalToys>=50){
           totalPrice=totalPrice-(totalPrice*25/100);
       }

        double rent = totalPrice*0.10;
        double win = totalPrice-rent;

        double diff =  Math.abs(win-TripPrice);
        if (win>=TripPrice){
            System.out.printf("Yes! %.2f lv left.",diff);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",diff);
        }

    }
}
