package lab.FirstSteps.Lab06;


public class PeriodicTablr {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 0;
        for (n1 = 1; n1 <= 10; n1++) {
            for (n2 = 1; n2 <= 10; n2++) {

                System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
            }

        }

    }
}
