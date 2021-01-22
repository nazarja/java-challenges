public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int last = number % 10;

        while (number > 9) {
            number /= 10;
        }

        return (number + last);
    }
}
