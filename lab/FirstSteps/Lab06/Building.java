package lab.FirstSteps.Lab06;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors= Integer.parseInt(scanner.nextLine());
        int apartments= Integer.parseInt(scanner.nextLine());

        for (int i = floors; i >=1 ; i--) {
            System.out.println("");
            for (int j = 0; j <apartments ; j++) {
                if(i==floors){
                    System.out.printf("L%d%d ",i,j);
                    continue;
                }
                if(i%2==0){
                    System.out.printf("O%d%d ",i,j);
                }else{
                    System.out.printf("A%d%d ",i,j);
                }

            }
        }
    }
}
