package Account;


import customer.ICustomer;

public class Account implements IAccount {
    private ICustomer customer;
    private double balance;

    public Account(ICustomer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }

    @Override
    public ICustomer getCustomer() {
        return customer;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You have deposited " + amount + " Your total balance is " + balance);
        } else
            System.out.println("Invalid amount");
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " Your total balance is " + balance);
            return true;
        } else {
            System.out.println("Invalid amount");
            return false;
        }
    }

}