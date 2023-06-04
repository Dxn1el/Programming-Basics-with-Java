package predvaritelenizpit;

import java.util.Scanner;

public class pinCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstnum = Integer.parseInt(scanner.nextLine());
        int secondnum = Integer.parseInt(scanner.nextLine());
        int thirdnum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= firstnum; i++) {

            for (int j = 2; j <= secondnum; j++) {

                for (int k = 1; k <= thirdnum; k++) {
                    if ((j == 2 || j == 5 || j == 7 || j == 3) && i % 2 == 0 && k % 2 == 0){
                        System.out.println(i+" "+j+" "+k);
                    }

                }
            }

        }
    }
}

