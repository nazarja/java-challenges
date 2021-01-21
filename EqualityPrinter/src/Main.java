public class Main {

    public static void main(String[] args) {
        IntEqualityPrinter.printEqual(1,1,1); // equal
        IntEqualityPrinter.printEqual(1,1,2); // neither equal
        IntEqualityPrinter.printEqual(-1,-1,-1); // invalid
        IntEqualityPrinter.printEqual(1,2,3); // different
    }
}
