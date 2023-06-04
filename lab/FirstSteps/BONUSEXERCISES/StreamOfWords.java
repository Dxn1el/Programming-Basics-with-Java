package lab.FirstSteps.BONUSEXERCISES;

import java.util.Scanner;

public class StreamOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "";
        String TempWord = "";
        boolean n = false;
        boolean o = false;
        boolean c = false;
        String input = scanner.nextLine();
        while (!input.equals("End")) {

            char symbol = input.charAt(0);
            if ((symbol >= 65 && symbol <= 90) || (symbol >= 97 && symbol <= 122)) {


                if (symbol == 'c' && c == false) {
                    c = true;
                    if (c && o && n) {
                        word += TempWord + " ";
                        TempWord = "";
                        n = false;
                        o = false;
                        c = false;
                    }
                    input = scanner.nextLine();
                    continue;
                } else if (symbol == 'o' && o == false) {
                    o = true;
                    if (c && o && n) {
                        word += TempWord + " ";
                        TempWord = "";
                        n = false;
                        o = false;
                        c = false;
                    }
                    input = scanner.nextLine();
                    continue;

                } else if (symbol == 'n' && n == false) {
                    n = true;
                    if (c && o && n) {
                        word += TempWord + " ";
                        TempWord = "";
                        n = false;
                        o = false;
                        c = false;
                    }
                    input = scanner.nextLine();
                    continue;

                }

                TempWord += symbol;
                input = scanner.nextLine();

            } else {
                input = scanner.nextLine();
                continue;
            }
        }
        System.out.println(word);
    }
}

