package exercises.PB03;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scanner.nextLine());
        int minuteOfExam = Integer.parseInt(scanner.nextLine());
        int hourOfArriving = Integer.parseInt(scanner.nextLine());
        int minuteOfArriving = Integer.parseInt(scanner.nextLine());

        int exam= hourOfExam*60+minuteOfExam;
        int arrival= hourOfArriving*60+minuteOfArriving;
        int diff= exam-arrival;
        String arrived="";
        String beforeOrAfter="";

        if(diff>=0&& diff<=30 ) {
            arrived = "On time";

        }else if(diff>30){
            arrived="Early";
        }else{
            arrived="Late";
        }

        beforeOrAfter= diff<0 ? "after" : "before";
        diff=Math.abs(diff);
        System.out.println(arrived );
           if(diff<60){
               System.out.printf("%d minutes %s the start",diff, beforeOrAfter);
           }else {
               System.out.printf("%d : %02d hours %s the start",diff/60,diff%60,beforeOrAfter);
           }
    }
    }

