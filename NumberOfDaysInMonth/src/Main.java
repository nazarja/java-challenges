public class Main {

    public static void main(String[] args) {
        int result;

        result = NumberOfDaysInMonth.getDaysInMonth(2, 2020);
        System.out.println(result); // 29

        result = NumberOfDaysInMonth.getDaysInMonth(2, 2018);
        System.out.println(result); // 28

        result = NumberOfDaysInMonth.getDaysInMonth(1, 2020);
        System.out.println(result); // 31

        result = NumberOfDaysInMonth.getDaysInMonth(4, 2020);
        System.out.println(result); // 30

        result = NumberOfDaysInMonth.getDaysInMonth(-4, 2020);
        System.out.println(result); // -1
    }
}
