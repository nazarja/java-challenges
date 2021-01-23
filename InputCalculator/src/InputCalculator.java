import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            // System.out.print("Enter a number: ");

            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            }
            else break;
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round(((double) sum / (double) count)));
        scanner.close();
    }
}
