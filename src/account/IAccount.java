package account;

import customer.ICustomer;

public interface IAccount {
    ICustomer getCustomer();
    boolean withdraw(double amount);
    void deposit(double amount);
    double getBalance();

    void setBalance(double v);
}
