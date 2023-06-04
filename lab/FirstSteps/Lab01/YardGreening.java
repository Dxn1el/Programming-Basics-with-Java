package lab.FirstSteps.Lab01;
import java.util.Scanner;

public class YardGreening {

    public static void main(String[] args) {

     Scanner scanner =  new Scanner(System.in);

     double yard= Double.parseDouble(scanner.nextLine());
     double price = yard*7.61;
     double discont= 0.18*price;
     double FinalPrice= price-discont;

        System.out.println( "The final price is: "+FinalPrice+  " lv.");
        System.out.println( "The Discount is: "+discont+  " lv.");

    }
}
