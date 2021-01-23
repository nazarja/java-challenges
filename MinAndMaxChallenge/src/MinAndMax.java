import java.util.Scanner;

public class MinAndMax {

    public static void MinMaxInputs() {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;

        while(true) {
            System.out.print("Enter number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                min = (number < min || min == 0) ? number : min;
                max = (number > max || max == 0) ? number : max;
            }
            else break;
        }

        System.out.println("Minimum number was: " + min);
        System.out.println("Maximum number was: " + max);
    }
}
