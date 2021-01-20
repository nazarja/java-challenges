public class LeapYear {

    public static boolean isLeapYear(int year) {
        boolean isValid = year >= 1 && year <= 9999;
        if (!isValid) return false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return (year % 400 == 0);
            } else return true;
        } else return false;
    }
}
