package lab.FirstSteps.Lab06;

import javax.xml.parsers.SAXParser;
import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String place = input;
            double neededMoney = Double.parseDouble(scanner.nextLine());
            while(true){
                double saved=Double.parseDouble(scanner.nextLine());
                neededMoney-=saved;
                if(neededMoney<=0){
                    System.out.printf("Going to %s!\n", place);
                    break;
                }
            }
            input=scanner.nextLine();
        }

    }
}

