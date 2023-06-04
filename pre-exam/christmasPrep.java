package predvaritelenizpit;

import java.util.Scanner;

public class christmasPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int PaperRolls=Integer.parseInt(scanner.nextLine());
        int clothRolls= Integer.parseInt(scanner.nextLine());
        double glue= Double.parseDouble(scanner.nextLine());
        double discount= Double.parseDouble(scanner.nextLine());


        double paperRollPrice=PaperRolls*5.80;
        double clothRoollsPrice=clothRolls*7.20;
        double gluePrice= glue*1.20;
        double finalSum= paperRollPrice+clothRoollsPrice+gluePrice;
        double finalSumWithDiscount=finalSum-(finalSum*discount/100);

        System.out.printf("%.3f",finalSumWithDiscount);
    }
}
