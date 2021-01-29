import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int arraySize) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[arraySize];

        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("Enter next Integer: ");
            intArray[i] = scanner.nextInt();
        }

        return intArray;
    }

    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("Element %s contents %s%n", i, intArray[i]);
        }
    }

    public static int[] sortIntegers(int[] intArray) {
        for(int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < (intArray.length - 1); j++) {
                if (intArray[j] < intArray[j+1]) {
                   int temp = intArray[j];
                   intArray[j] = intArray[j+1];
                   intArray[j+1] = temp;
                }
            }
        }
        return intArray;
    }
}
