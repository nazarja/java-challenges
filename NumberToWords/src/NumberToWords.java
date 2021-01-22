public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < -1) System.out.println("Invalid Value");
        String[] wordsArray = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String wordsString = "";

        int reversed = reverse(number);
        int digitCount = getDigitCount(number);

        for (int i = 0; i < digitCount; i++) {
            wordsString += wordsArray[(reversed % 10)];
            wordsString += (i != (digitCount - 1)) ? " " : "";
            reversed = Math.round(reversed / 10);
        }

        System.out.println(wordsString);
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        return Integer.toString(Math.abs(number)).length();
    }

    public static int reverse(int number) {
        boolean isNegetive = (number < 0);
        int reversed = 0;
        number = Math.abs(number);

        while (number > 0) {
            reversed = (reversed * 10) + number % 10;
            number = Math.round(number / 10);
        }

        return isNegetive ? -reversed : reversed;
    }
}
