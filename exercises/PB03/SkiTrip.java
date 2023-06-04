package exercises.PB03;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //по-малко от 10 дни между 10 и 15 дни повече от 15 дни

        int stay= Integer.parseInt(scanner.nextLine())-1;
        String hotel= scanner.nextLine();
        String grade=scanner.nextLine();


        double room_for_one_person = 18.00  *stay;
        double apartment = 25.00  *stay;
        double president_apartment = 35.00 *stay;
        boolean  less_Than_10_Days= stay<10;
        boolean  between_10_And_15_Days= stay>=10 && stay<=15;
        boolean  more_Than_15_Days= stay>15;
        double discount = 0.0;
        double total=0.0;
        switch(hotel){
            case "room for one person":
                if("positive".equals(grade)){
                    room_for_one_person*=1.25;
                    System.out.printf("%.2f",room_for_one_person);
                }else{
                    room_for_one_person*=0.90;
                    System.out.printf("%.2f",room_for_one_person);
                }

                break;
            case "apartment":
                if(less_Than_10_Days){
                    discount=apartment*30/100;
                } else if (between_10_And_15_Days) {
                    discount=apartment*35/100;
                }else{
                    discount=apartment*50/100;
                }
                total = apartment-discount;
                if("positive".equals(grade)){
                    total*=1.25;

                }else{
                    total*=0.90;
                }
                System.out.printf("%.2f",total);
                break;

            case "president apartment":
                if(less_Than_10_Days){
                    discount=president_apartment*10/100;
                }else if (between_10_And_15_Days) {
                    discount=president_apartment*15/100;
                }else{
                    discount=president_apartment*20/100;
                }

                total = president_apartment-discount;

                if("positive".equals(grade)){
                    total=total+(total*25/100.0);
                }else{
                    total=total-(total*10/100.0);
                }

                System.out.printf("%.2f",total);
                break;


        }
    }
}

