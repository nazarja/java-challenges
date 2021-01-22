public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        for (int i = Math.min(first, second); i > 0; i--) {
            int firstRemainder = first % i;
            int secondRemainder = second % i;

            if (firstRemainder == 0 && secondRemainder == 0) return i;
        }

        return -1;
    }
}
