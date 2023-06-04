package exercises.PB03;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String flowers = scanner.nextLine();
        int howMuchFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());


        double rose = 5.0;
        double dalia = 3.80;
        double Tulips= 2.80;
        double Narcissus= 3.0;
        double Gladiolus= 2.50;
        double price;
      switch (flowers){
          case "Roses":
              price = howMuchFlowers * rose ;
            if(howMuchFlowers>80) {
                price= price-price*10/100;
                if (price <= budget) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", howMuchFlowers
                            , flowers, budget - price);
                } else {
                    System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
                }
            }else if(price<=budget) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", howMuchFlowers
                        , flowers, budget - price);
            }else if(price>budget){
                System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
            }
            break;
          case "Dahlias":
              price = howMuchFlowers * dalia ;
              if(howMuchFlowers>90) {
                  price = price- price * 15 / 100;
                  if (price <= budget) {
                      System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", howMuchFlowers
                              , flowers, budget - price);
                  } else {
                      System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
                  }
              }else if(price<=budget) {
                  System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", howMuchFlowers
                          , flowers, budget - price);
              }else if(price>budget) {
                  System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
              }
              break;
          case "Tulips":
              price = howMuchFlowers * Tulips ;
              if(howMuchFlowers>80) {
                  price = price- price * 15 / 100;
                  if (price <= budget) {
                      System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", howMuchFlowers
                              , flowers, budget - price);
                  } else {
                      System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
                  }
              }else if(price<=budget) {
                  System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", howMuchFlowers
                          , flowers, budget - price);
              }else if(price>budget){
                  System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
              }
              break;
          case "Narcissus":
              price = howMuchFlowers * Narcissus ;
              if(howMuchFlowers<120) {
                  price = (Narcissus*1.15)*howMuchFlowers;
                  if (price <= budget) {
                      System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", howMuchFlowers
                              , flowers, budget - price);
                  } else {
                      System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
                  }
              }else if(price<=budget) {
                  System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", howMuchFlowers
                          , flowers, budget - price);
              }else if(price>budget){
                  System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
              }
              break;
          case "Gladiolus":
              price = howMuchFlowers * Gladiolus ;
              if(howMuchFlowers<80) {
                  price = price*1.20;
                  if (price <= budget) {
                      System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", howMuchFlowers
                              , flowers, budget - price);
                  } else {
                      System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
                  }
              }else if(price<=budget) {
                  System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", howMuchFlowers
                          , flowers, budget - price);
              }else if(price>budget){
                  System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
              }
              break;
        }
    }
}
