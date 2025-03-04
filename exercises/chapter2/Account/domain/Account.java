package exercises.chapter2.Account.domain;

public class Account {
    private String name;

    public Account(String name, double balance) {
        this.name = name;

        if  (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            this.balance += depositAmount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
