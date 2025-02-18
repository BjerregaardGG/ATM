package Account;

import customer.ICustomer;

public interface IAccount {
    ICustomer getCustomer();
    boolean withdraw(double amount);
    void deposit(double amount);
    double getBalance();
}
