package exercises.PB06;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double AVGscore = 0.0;
        double finaL=0.0;
        int projects=0;
        int jury = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!"Finish".equals(input)) {
            projects+=1;
            AVGscore=0;
            for (int i = 0; i < jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                AVGscore += grade;

            }
            AVGscore /= jury;
            finaL+=AVGscore;
            System.out.printf("%s - %.2f.%n", input, AVGscore);

            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",finaL/projects );
    }
}
