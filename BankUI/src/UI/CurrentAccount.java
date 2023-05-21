package UI;

public class CurrentAccount {
    private static final double INITIAL_DEPOSIT = 100000;
    private static final double MAX_WITHDRAWAL_AMOUNT = 10000;

    private double balance;

    public CurrentAccount() {
        balance = INITIAL_DEPOSIT;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: Amount = " + amount);
    }

    public void withdraw(double amount) {
        if (amount > MAX_WITHDRAWAL_AMOUNT) {
            System.out.println("Exceeded maximum withdrawal amount!");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawal: Amount = " + amount);
    }


}