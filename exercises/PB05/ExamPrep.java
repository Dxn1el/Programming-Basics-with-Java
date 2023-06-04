package exercises.PB05;

import java.util.Scanner;

public class ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fuckedGrades = Integer.parseInt(scanner.nextLine());
        double avgscore = 0.0;

        int numofproblems = 0;
        String lastproblem = "";
        int fuck = 0;

        while (true) {
            String problem = scanner.nextLine();
            if ("Enough".equals(problem)) {
                System.out.printf("Average score: %.2f\n", avgscore / numofproblems);
                System.out.printf("Number of problems: %d\n", numofproblems);
                System.out.printf("Last problem: %s", lastproblem);
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade > 4) {

                avgscore += grade;
                numofproblems++;
                lastproblem = problem;
            } else {

                avgscore += grade;
                numofproblems++;
                lastproblem = problem;
                fuck++;

                if (fuckedGrades == fuck) {
                    System.out.printf("You need a break, %d poor grades.", fuckedGrades);
                    break;
                }

            }

        }
    }
}
