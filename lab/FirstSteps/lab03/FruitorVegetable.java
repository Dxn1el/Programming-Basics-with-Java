package lab.FirstSteps.lab03;
import java.util.Scanner;
public class FruitorVegetable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String thing = scanner.nextLine();

        switch (thing) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                break;
            default:
                System.out.println("unknown");
        }

    }
}
