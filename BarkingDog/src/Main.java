public class Main {

    public static void main(String[] args) {
        boolean result;

        result = BarkingDog.shouldWakeUp(true, 10);
        System.out.println(result); //false

        result = BarkingDog.shouldWakeUp(true, 7);
        System.out.println(result); //true

        result = BarkingDog.shouldWakeUp(false, 10);
        System.out.println(result); //false

        result = BarkingDog.shouldWakeUp(true, 24);
        System.out.println(result); // false
    }
}