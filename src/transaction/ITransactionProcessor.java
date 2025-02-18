package transaction;

public interface ITransactionProcessor {
   boolean processTransaction(IAccount account, double amount) throws InsufficientFundsException;
}
