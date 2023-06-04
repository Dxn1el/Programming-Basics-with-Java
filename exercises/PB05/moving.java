package exercises.PB05;

import java.util.Scanner;

public class moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        int cubics = w * l * h;


        while (true) {
            String input = scanner.nextLine();
            if ("Done".equals(input)) {
                System.out.printf("%d Cubic meters left.", cubics);
                return;
            }
            int boxes = Integer.parseInt(input);
            cubics -= boxes;
            if (cubics <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(cubics));
                return;
            }
        }
    }
}
