package exercises.PB04;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroups = Integer.parseInt(scanner.nextLine());
        double musala = 0.0;
        double monblan = 0.0;
        double kilimajaro = 0.0;
        double k2 = 0.0;
        double everest = 0.0;

        int allClimbers = 0;
        for (int i = 0; i < numberOfGroups; i++) {
            int numberOfClimbers = Integer.parseInt(scanner.nextLine());
            allClimbers += numberOfClimbers;
            if (numberOfClimbers <= 5) {
                musala+=numberOfClimbers;
            } else if (numberOfClimbers <= 12) {
                monblan+=numberOfClimbers;
            } else if (numberOfClimbers <= 25) {
                kilimajaro+=numberOfClimbers;
            } else if (numberOfClimbers <= 40) {
                k2+=numberOfClimbers;
            } else {
                everest+=numberOfClimbers;
            }
        }
        musala = musala / allClimbers * 100;
        monblan = monblan / allClimbers * 100;
        kilimajaro = kilimajaro / allClimbers * 100;
        k2 = k2 / allClimbers * 100;
        everest = everest / allClimbers * 100;

        System.out.printf("%.2f%%\n", musala);
        System.out.printf("%.2f%%\n", monblan);
        System.out.printf("%.2f%%\n", kilimajaro);
        System.out.printf("%.2f%%\n", k2);
        System.out.printf("%.2f%%\n", everest);

    }
}
