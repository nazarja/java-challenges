public class NumberInWord {

    public static void printNumberInWord(int number) {
        String[] numbers = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        String print = "";

        switch (number) {
            case 0:
                print = numbers[0];
                break;
            case 1:
                print = numbers[1];
                break;
            case 2:
                print = numbers[2];
                break;
            case 3:
                print = numbers[3];
                break;
            case 4:
                print = numbers[4];
                break;
            case 5:
                print = numbers[5];
                break;
            case 6:
                print = numbers[6];
                break;
            case 7:
                print = numbers[7];
                break;
            case 8:
                print = numbers[8];
                break;
            case 9:
                print = numbers[9];
                break;
            default:
                System.out.println("OTHER");
        }

        if (print != "") System.out.println(print);
    }
}
