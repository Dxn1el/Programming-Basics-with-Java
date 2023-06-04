package exercises.PB01;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double NeedSafetyNylon = Double.parseDouble(scanner.nextLine());
        double NeedPaint = Double.parseDouble(scanner.nextLine());
        double NeedPaintThinner = Double.parseDouble(scanner.nextLine());
        double HoursOfWork = Double.parseDouble(scanner.nextLine());

        double SafetyNylon = 1.50;
        double Paint=14.50;
        double PaintThinner=5.0;
        double bags=0.40;

        double SumSafetyNylon = (NeedSafetyNylon+2)*SafetyNylon;
        double SumPaint=(NeedPaint+NeedPaint*0.10)*Paint;
        double SumPaintThinner=PaintThinner*NeedPaintThinner;

        double SumOfMaterials=SumSafetyNylon+SumPaintThinner+SumPaint+bags;
        double SumHoursOfWork=(SumOfMaterials*0.30)*HoursOfWork;
        double sum= SumOfMaterials+SumHoursOfWork;

        System.out.println(sum);


    }
}
