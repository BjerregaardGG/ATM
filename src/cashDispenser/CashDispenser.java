package cashDispenser;

public class CashDispenser implements ICashDispenser {
    public void dispenseCash(double amount) {
        System.out.println("Amount dispensed: " + amount);
    }

}
