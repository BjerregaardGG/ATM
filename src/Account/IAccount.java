package Account;

public interface IAccount {
    double getBalance = 0;
    boolean withdraw = false;
    default void deposit(double amount) {

    }

    boolean withdraw();

    double getBalance(String placeholder);
}
