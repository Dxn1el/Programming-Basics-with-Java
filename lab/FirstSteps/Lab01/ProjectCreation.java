package lab.FirstSteps.Lab01;

import java.util.Scanner;

public class ProjectCreation {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int hours = projects * 3;

       System.out.printf("The architect %s will need %d hours to complete %d project/s.",name,hours,projects);
    }
}
