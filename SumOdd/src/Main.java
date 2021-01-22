public class Main {

    public static void main(String[] args) {
        int result;

        result = SumOddRange.sumOdd(1,100);
        System.out.println(result); // 2500

        result = SumOddRange.sumOdd(-1,100);
        System.out.println(result); // -1

        result = SumOddRange.sumOdd(100,100);
        System.out.println(result); // 0
    }
}
