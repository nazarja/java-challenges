public class Main {

    public static void main(String[] args) {

        System.out.println(
                FlourPacker.canPack(1,0,4)
        ); // false


        System.out.println(
                FlourPacker.canPack(1,0,5)
        ); // true

        System.out.println(
                FlourPacker.canPack(2,2,11)
        ); // true
    }
}
