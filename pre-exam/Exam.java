package predvaritelenizpit;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double topStudents = 0;
        double okStudents = 0;
        double mehStudents = 0;
        double failStudents = 0;
        double avgScore = 0;
        for (int i = 0; i < n; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            avgScore += grade;
            if (grade >= 5.00) {
                topStudents++;
            } else if (grade >= 4.00) {
                okStudents++;
            } else if (grade >= 3) {
                mehStudents++;
            } else {
                failStudents++;
            }
        }

        topStudents = topStudents / n * 100;
        okStudents = okStudents / n * 100;
        mehStudents = mehStudents / n * 100;
        failStudents = failStudents / n * 100;
        avgScore = avgScore / n;
        System.out.printf("Top students: %.2f%%\n", topStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", okStudents);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", mehStudents);
        System.out.printf("Fail: %.2f%%\n", failStudents);
        System.out.printf("Average: %.2f", avgScore);


    }
}
