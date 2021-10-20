import java.text.NumberFormat;

public class Account {
    private int id;
    private double total;
    private double limit;
    private int owner;

    public Account(double total, double limit, int id, int owner) {
        this.total = total;
        this.limit = limit;
        this.id = id;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public boolean withdraw(double amount) {
        if (amount > total || amount <= 0) {
            return false;
        }
        total -= amount;
        return true;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }

        this.total += amount;
        return true;
    }

    public void printLimit() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(this.limit);
        System.out.println("Limit: " + moneyString);
    }

    public void printBalance() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(this.total);
        System.out.println("Balance: " + moneyString);
    }
}
