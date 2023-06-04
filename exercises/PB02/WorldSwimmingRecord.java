package exercises.PB02;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);



        double record = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeSeconds = Double.parseDouble(scanner.nextLine());

        double distance =  distanceMeters*timeSeconds;
        double slowing=Math.floor(distanceMeters/15)*12.5;

        double overall = distance+slowing;


        if(overall<record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",overall);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.",overall-record);
        }

    }
}
