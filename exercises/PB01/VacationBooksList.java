package exercises.PB01;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int pages=Integer.parseInt(scanner.nextLine());
        int pagesForOneH=Integer.parseInt(scanner.nextLine());
        int deadline=Integer.parseInt(scanner.nextLine());

        int sum= pages/pagesForOneH;
        int result= sum/deadline;
        System.out.println(result);


    }
}
