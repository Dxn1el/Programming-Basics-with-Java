package exercises.PB06;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int num = 1;
        boolean breakLoop = false;
        for (int i = 1; i <= number; i++) {
            if (breakLoop) {
                break;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
                if (num > number) {
                    breakLoop = true;
                    break;
                }
            }
            System.out.println();
        }
    }
}
