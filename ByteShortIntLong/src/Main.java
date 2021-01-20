public class Main {

    public static void main(String[] args) {

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Min Byte = " + myMinByteValue);
        System.out.println("Max Byte = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Min Short = " + myMinShortValue);
        System.out.println("Max Short = " + myMaxShortValue);

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Min Int = " + myMinIntValue);
        System.out.println("Max Int = " + myMaxIntValue);
        System.out.println("Busted Min Int (overflow) = " + (myMinIntValue - 1));
        System.out.println("Busted Max Int (overflow) = " + (myMaxIntValue + 1));

        int myMaxIntTest = 2_147_483_647;

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myValue);
        System.out.println("Min Long = " + myMinLongValue);
        System.out.println("Max Long = " + myMaxLongValue);

        // casting
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}