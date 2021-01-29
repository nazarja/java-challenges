import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int size = scanner.nextInt();
        scanner.close();
        return size;
    }

    private static int[] readElements(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter an Integer: ");
            intArray[i] = scanner.nextInt();
        }
        scanner.close();
        return intArray;
    }

    private static int findMin(int[] intArray) {
        int min = intArray[0];

        for (int i: intArray) {
            if (i < min) min = i;
        }

        return min;
    }
}
