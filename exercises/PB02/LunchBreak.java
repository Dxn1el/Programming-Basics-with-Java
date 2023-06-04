package exercises.PB02;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Име на сериал – текст
        //
        //2. Продължителност на епизод – цяло число в диапазона [10… 90]
        //
        //3. Продължителност на почивката – цяло число в диапазона [10… 120]


        String series = scanner.nextLine();
        int episodeTime=Integer.parseInt(scanner.nextLine());
        int breakTime=Integer.parseInt(scanner.nextLine());


        double remainingTime=breakTime-breakTime/8.0-breakTime/4.0;

        if(remainingTime>=episodeTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",series,Math.ceil(remainingTime-episodeTime));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",series,Math.ceil(episodeTime-remainingTime));
        }

    }
}
