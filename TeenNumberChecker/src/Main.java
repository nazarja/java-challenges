public class Main {

    public static void main(String[] args) {
        boolean result;

        result = TeenNumberChecker.hasTeen(9,99,19);
        System.out.println(result); // true

        result = TeenNumberChecker.hasTeen(23,15,42);
        System.out.println(result); // true

        result = TeenNumberChecker.hasTeen(22,23,34);
        System.out.println(result); // false
    }
}