public class Main {

    public static void main(String[] args) {
        boolean result;

        result = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(result); // true

        result = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(result); // false

        result = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(result); // true
    }
}
