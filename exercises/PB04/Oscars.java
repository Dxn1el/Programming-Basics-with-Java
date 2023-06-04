package exercises.PB04;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academicPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {

            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());
            academicPoints += (judgeName.length() * judgePoints) / 2;
            if (academicPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, academicPoints);
                break;
            }
        }
        if (academicPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, Math.abs(academicPoints - 1250.5));
        }
    }
}
