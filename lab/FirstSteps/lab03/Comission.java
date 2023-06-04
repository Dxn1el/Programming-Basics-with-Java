package lab.FirstSteps.lab03;

import java.util.Scanner;

public class Comission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //град (текст) и обем на продажби (реално число)
        String city= scanner.nextLine();
        double volume = Double.parseDouble(scanner.nextLine());

        boolean s=volume >=0.0&&volume <=500.0;
        boolean m=volume >500.0&&volume <=1000.0;
        boolean l= volume >1000.0 && volume <=10000.0;
        boolean xl= volume >10000.0;

      /**  if (city.equals("Sofia")){
            if(s){
                System.out.println(volume *0.5);
            }else if(m) {
                System.out.println(volume *0.7);
            }else if (l){
                System.out.println(volume*0.8);
            }else if(xl){
                System.out.println(volume *1.2);
            }
        }**/
      if (city.equals("Sofia")||city.equals("Varna")||city.equals("Plovdiv")){
          if(city.equals("Sofia")){
              if(s){
                  System.out.printf("%.2f",volume *0.05);
              }else if(m) {
                  System.out.printf("%.2f",volume *0.07);
              }else if (l){
                  System.out.printf("%.2f",volume*0.08);
              }else if(xl) {
                  System.out.printf("%.2f",volume * 0.12);
              }
          }else if(city.equals("Plovdiv")) {
              if (s) {
                  System.out.printf("%.2f",volume * 5.5/100.0);
              } else if (m) {
                  System.out.printf("%.2f",volume * 8/100.0);
              } else if (l) {
                  System.out.printf("%.2f",volume * 12/100.0);
              } else if (xl) {
                  System.out.printf("%.2f",volume * 14.5/100.0);
              }

          }else if(city.equals("Varna")) {
              if (s) {
                  System.out.printf("%.2f",volume * 4.5/100.0);
              } else if (m) {
                  System.out.printf("%.2f",volume * 7.5/100.0);
              } else if (l) {
                  System.out.printf("%.2f",volume * 10/100.0);
              } else if (xl) {
                  System.out.printf("%.2f",volume * 13/100.0);
              }
          }
      }else{
          System.out.println("error");
      }





    }
}
