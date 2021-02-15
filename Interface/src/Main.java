public class Main {

    public static void main(String[] args) {
        Player player = new Player("sean", 5, 10);
        System.out.println(player.toString());

        Monster monster = new Monster("paul", 5, 10);
        System.out.println(monster.toString());
    }
}
