public class Main {

    public static void main(String[] args) {
        int[] intArray = SortedArray.getIntegers(5);
        int[] sorted = SortedArray.sortIntegers(intArray);
        SortedArray.printArray(sorted);
    }
}
