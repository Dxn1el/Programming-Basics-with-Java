package exercises.PB05;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stepsForTheDay = 0;
        int goal = 10000;

        while (true) {
            String input = scanner.nextLine();
            if ("Going home".equals(input)) {
                int stepshome = Integer.parseInt(scanner.nextLine());
                stepsForTheDay += stepshome;
                if (stepsForTheDay >= goal) {
                    System.out.println("Goal reached! Good job!");
                    System.out.printf("%d steps over the goal!", Math.abs(goal - stepsForTheDay));
                    break;
                } else {
                    System.out.printf("%d more steps to reach goal.", Math.abs(goal - stepsForTheDay));
                    break;
                }
            }
            int steps = Integer.parseInt(input);
            stepsForTheDay += steps;
            int diff = Math.abs(goal - stepsForTheDay);

            if (stepsForTheDay >= goal) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", diff);
                break;
            }


        }
    }
}
