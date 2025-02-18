package transaction;

import account.IAccount;

public class TransactionProcessor implements ITransactionProcessor {
    public boolean processTransaction(IAccount account,double amount) {
        if (account != null) {
            if (account.getBalance() >= amount) {
                account.setBalance(account.getBalance() - amount);
                return true;
            } else {
                throw new InsufficientFundsException();
            }
        }
        return false;
    }
}
