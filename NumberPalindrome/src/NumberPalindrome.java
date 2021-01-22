public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);

        int original = number;
        int reverse = 0;

        while (number > 0) {
            reverse = (reverse * 10) + number % 10;
            number = Math.round(number / 10);
        }

        return (original == reverse);
    }
}
