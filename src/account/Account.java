package account;


public class Account implements IAccount {
    String placeholder;
    @Override
    public void deposit(double amount) {

        double balance = 0;
        balance += amount;
        System.out.println("You have deposited " + amount);
        System.out.println("Your balance is " + balance);
    }

    @Override
    public boolean withdraw() {
        if

    }
    @Override
    public double getBalance(String placeholder){
        return placeholder.getBalance;
    }

}
