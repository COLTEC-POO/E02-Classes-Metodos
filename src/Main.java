public class Main {

    public static void main(String[] args) {
        Account account = new Account(0.0, 500.0, 1, 1);

        account.deposit(100.0);
        account.withdraw(250.0);

        account.printBalance();
        account.printLimit();
    }

}
