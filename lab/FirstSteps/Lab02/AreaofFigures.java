package lab.FirstSteps.Lab02;

import java.util.Scanner;

public class AreaofFigures {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String figure= scanner.nextLine();

        if(figure.equals("square") ){
            double Side= Double.parseDouble(scanner.nextLine());
            System.out.println(Side*Side);

        }else if(figure.equals("rectangle")){
            double SideRectangle=Double.parseDouble(scanner.nextLine());
            double SecondSideOfRectangle= Double.parseDouble(scanner.nextLine());
            System.out.println(SideRectangle*SecondSideOfRectangle);

        }else if (figure.equals("circle")){
            double Radius= Double.parseDouble(scanner.nextLine());
            System.out.println(Math.PI*Radius*Radius);

        }else if (figure.equals("triangle") ){
            double SideOfTriangle=Double.parseDouble(scanner.nextLine());
            double HeightOfTriangle= Double.parseDouble(scanner.nextLine());
            System.out.println(SideOfTriangle*HeightOfTriangle/2);
        }
    }
}
