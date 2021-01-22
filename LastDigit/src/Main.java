public class Main {

    public static void main(String[] args) {
        System.out.println(
                LastDigitChecker.hasSameLastDigit(41,22,71)
        ); // true

        System.out.println(
                LastDigitChecker.hasSameLastDigit(23,32,42)
        ); // true

        System.out.println(
                LastDigitChecker.hasSameLastDigit(9,99,999)
        ); // false

        System.out.println(
                LastDigitChecker.hasSameLastDigit(15,76,23)
        ); // false
    }
}
