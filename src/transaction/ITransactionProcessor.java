package transaction;

import account.IAccount;

public interface ITransactionProcessor {
   boolean processTransaction(IAccount account,double amount) throws InsufficientFundsException;
}
