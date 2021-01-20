public class Main {

    public static void main(String[] args) {
        boolean result;

        result = LeapYear.isLeapYear(1700); // false
        System.out.println(result);

        result = LeapYear.isLeapYear(1600); // true
        System.out.println(result);
    }
}

