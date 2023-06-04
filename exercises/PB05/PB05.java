package exercises.PB05;

import java.util.Scanner;

public class PB05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String favBookie = scanner.nextLine();
        int numbook = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", numbook);
                break;
            }
            if (input.equals(favBookie)) {
                System.out.printf("You checked %d books and found it.", numbook);
                break;
            } else {
                numbook++;
            }

        }

    }
}
