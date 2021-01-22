public class LastDigitChecker {

    public static boolean hasSameLastDigit(int first, int second, int third) {
        int[] numbers = {first, second, third};
        int[] digits = new int[3];
        int count = 0;

        for (int i: numbers) {
            if (!isValid(i)) return false;
            else digits[count] = (i % 10);
            count++;
        }

        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i+1; j < digits.length; j++) {
                if (digits[i] == digits[j]) return true;
            }
        }

        return false;

    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }
}

// return ((digits[0] == digits[1] )|| (digits[0] == digits[2]) || (digits[0] == digits[2]) || (digits[1] == digits[2]));
