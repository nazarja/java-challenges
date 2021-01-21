public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) System.out.println("Invalid Value");
        else {
            int oneYear = (60 * 24 * 365);
            long years = minutes / oneYear;
            long days = (minutes % oneYear) / (60 * 24);
            String message = minutes + " min = " + years + " y and " + days + " d";
            System.out.println(message);
        }
    }
}
