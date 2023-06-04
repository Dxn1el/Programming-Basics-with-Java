package exercises.PB05;

import java.util.Scanner;

public class cakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int duljina = Integer.parseInt(scanner.nextLine());
        int shirochina = Integer.parseInt(scanner.nextLine());
        int cake = duljina * shirochina;
        while (cake > 0) {
            String input = scanner.nextLine();
            if ("STOP".equals(input)) {
                System.out.printf("%d pieces are left.", cake);
                return;
            }
            int pieceOfCake = Integer.parseInt(input);
            cake -= pieceOfCake;
            if (cake < 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cake));
                return;
            }
        }
    }
}
