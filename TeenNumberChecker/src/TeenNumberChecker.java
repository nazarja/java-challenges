public class TeenNumberChecker {

    public static boolean hasTeen(int first, int second, int third) {
        int[] ages = {first, second, third};
        boolean includesTeen = false;

        for (int age: ages) {
            if (isTeen(age)) includesTeen = true;
        }

        return includesTeen;
    }

    public static boolean isTeen(int age) {
        return (age >= 13 && age <= 19);
    }
}
