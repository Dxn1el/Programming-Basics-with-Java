package exercises.PB04;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int tournamets = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        double wonTournamets = 0.0;
        int points = 0;
        for (int i = 0; i < tournamets; i++) {
            String ranking = scanner.nextLine();
            switch (ranking) {
                case "W":
                    points += 2000;
                    wonTournamets++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;

                    break;

            }
        }
        startingPoints += points;

        int avgPoints = points / tournamets;
        wonTournamets = wonTournamets / tournamets * 100;
        System.out.printf("Final points: %d\n", startingPoints);
        System.out.printf("Average points: %d\n", avgPoints);
        System.out.printf("%.2f%%", wonTournamets);

    }
}
