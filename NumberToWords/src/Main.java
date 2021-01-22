public class Main {

    public static void main(String[] args) {
        NumberToWords.numberToWords(123); // "One Two Three"
        NumberToWords.numberToWords(1010); // "One Zero One Zero"
        NumberToWords.numberToWords(9725); // "Nine Seven Two Five"
        NumberToWords.numberToWords(-12); // "Invalid Value"

        System.out.println(
            NumberToWords.reverse(-12) // "-21"
        );


    }
}