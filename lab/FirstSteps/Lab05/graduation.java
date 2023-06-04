package lab.FirstSteps.Lab05;

import java.util.Scanner;

public class graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        int failedClasses = 0;
        double score;
        int grade = 1;
        double avgGrade = 0;

        while (grade <= 12) {
            score = Double.parseDouble(scanner.nextLine());

            if (score >= 4) {
                grade++;
                avgGrade += score;
            } else {
                failedClasses++;

                if (failedClasses == 2) {

                    System.out.printf("%s has been excluded at %d grade", studentName, grade);
                    return;
                }
            }
        }
        avgGrade = avgGrade / 12;
        System.out.printf("%s graduated. Average grade: %.2f", studentName, avgGrade);
    }
}
