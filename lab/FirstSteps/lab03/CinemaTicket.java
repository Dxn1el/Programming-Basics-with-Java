package lab.FirstSteps.lab03;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String day_Of_The_Week = scanner.nextLine();
        int ticket;

        if (day_Of_The_Week.equals("Monday") || day_Of_The_Week.equals("Tuesday") || day_Of_The_Week.equals("Friday")) {
            ticket = 12;
            System.out.println(ticket);
        } else if (day_Of_The_Week.equals("Wednesday") || day_Of_The_Week.equals("Thursday")) {
            ticket = 14;
            System.out.println(ticket);
        } else {
            ticket = 16;
            System.out.println(ticket);
        }
    }
}
