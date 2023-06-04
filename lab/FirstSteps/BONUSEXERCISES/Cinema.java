package lab.FirstSteps.BONUSEXERCISES;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	На първия ред - капацитет на залата - цяло число в интервала [50... 150]
        //На всеки следващ ред до команда "Movie time!":
        //o	Брой хора влизащи в киното - цяло число в интервала [1… 15]
        int capacity = Integer.parseInt(scanner.nextLine());
        int income = 0;
        String input = scanner.nextLine();
        while (true) {
            int people = Integer.parseInt(input);
            capacity-=people;
            if(capacity<0){
                System.out.println("The cinema is full.");
                break;
            }


            income += people * 5;
            if (people % 3 == 0) {
                income -= 5;
            }
            input=scanner.nextLine();
            if("Movie time!".equals(input)){
                System.out.printf( "There are %d seats left in the cinema.\n",capacity);
                break;
            }
        }
        System.out.printf("Cinema income - %d lv.",income);
    }
}

