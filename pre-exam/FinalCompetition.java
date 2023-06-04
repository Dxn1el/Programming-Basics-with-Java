package predvaritelenizpit;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();
        double prize;

        if ("Bulgaria".equals(place)) {
            prize = dancers * points;
            if ("winter".equals(season)) {
                prize = prize-prize*8/100;
            } else {
                prize = prize-prize*5/100;
            }
        } else {
            prize = (dancers * points) + ((dancers * points) * 50 / 100);
            if ("winter".equals(season)) {
                prize = prize-prize*15/100;
            } else {
                prize = prize-prize*10/100;
            }
        }
        double sumForCharity = prize * 75 / 100;
        double leftsum = prize - sumForCharity;
        double prizeForEachDancer = leftsum / dancers;
        System.out.printf("Charity - %.2f \n", sumForCharity);
        System.out.printf("Money per dancer - %.2f", prizeForEachDancer);
    }
}
