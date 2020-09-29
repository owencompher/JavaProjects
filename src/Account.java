// Owen Compher
// Savings Account project
// 9-25-2020

public class Account {
    private final String name;
    private final double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String toString() {
        return name + ", " + balance;
    }

    public boolean equals(Object other) {
        Account otherAccount = (Account) other;
        return (this.balance == otherAccount.balance) &&
                this.name.equals(otherAccount.name);
    }

    public static void main(String[] args) {
        Account acct1 = new Account("Armani Smith",1500);
        System.out.println(acct1);
        System.out.println(acct1.toString());
    }
}

class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(String name, double balance, double interest) {
        super(name, balance);
        this.interest = interest;
    }

    public String toString() {
        return super.toString() + ", "  + interest;
    }

    public boolean equals(Object other) {
        return super.equals(other) &&
               this.interest == ((SavingsAccount) other).interest;
    }
}