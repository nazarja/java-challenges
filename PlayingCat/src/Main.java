public class Main {

    public static void main(String[] args) {
        boolean result;

        result = PlayingCat.isCatPlaying(true, 10);
        System.out.println(result); // false

        result = PlayingCat.isCatPlaying(false, 36);
        System.out.println(result); // false

        result = PlayingCat.isCatPlaying(false, 35);
        System.out.println(result); // true
    }
}