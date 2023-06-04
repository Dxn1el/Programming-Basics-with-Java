package lab.FirstSteps.lab03;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int time= Integer.parseInt(scanner.nextLine());
    String day= scanner.nextLine();
    boolean open =  time >=10 && time<=18;

    if(open&& day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")||day.equals("Saturday")) {
        System.out.println("open");
    }else {
        System.out.println("closed");
    }
    }
}
