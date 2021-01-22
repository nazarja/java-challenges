public class SharedDigit {

    public static boolean hasSharedDigit(int first, int second) {
        if ((first < 10 || first > 99) || (second < 10 || second > 99)) return false;

        boolean hasShared = false;

        String newFirst = Integer.toString(first);
        String newSecond = Integer.toString(second);

        int count = 0;
        while(count < newFirst.length()) {
            char current = newFirst.charAt(count);
            if  (newSecond.contains(""+current)) hasShared = true;
            count++;
        }
        return hasShared;
    }
}
