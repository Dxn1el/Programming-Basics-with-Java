package exercises.PB06;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int student = 0;
        int standart = 0;
        int kids = 0;
        int totalTickets=0;

        String input = scanner.nextLine();
        while (!"Finish".equals(input)) {
            String movieName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int currentTicketsCount = 0;

            input = scanner.nextLine();
            while (!"End".equals(input)) {
                String ticket = input;
                currentTicketsCount++;

                switch (ticket) {
                    case "student":
                        student += 1;
                        break;
                    case "standard":
                        standart += 1;
                        break;
                    case "kid":
                        kids += 1;
                        break;
                }
                if (currentTicketsCount >= freeSeats) {
                    break;
                }
                input = scanner.nextLine();

            }
            totalTickets+=currentTicketsCount;
            System.out.printf("%s - %.2f%% full.%n",movieName,100.0*currentTicketsCount/freeSeats);
        input=scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n",totalTickets);
        System.out.printf("%.2f%% student tickets.%n",100.0*student/totalTickets);
        System.out.printf("%.2f%% standard tickets.%n",100.0*standart/totalTickets);
        System.out.printf("%.2f%% kids tickets.%n",100.0*kids/totalTickets);

    }
}
