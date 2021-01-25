public class Main {

    public static void main(String[] args) {
        Account account = new Account(
                123456,
                0.00,
                "Sean Murphy",
                "seren@gmail.com",
                "087123456"
        );

        account.setBalance(100);
        account.withdrawFunds(100);
        account.withdrawFunds(1);
    }
}
