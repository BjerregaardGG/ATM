package transaction;

public interface ITransactionProcessor {
   boolean processTransaction(Account account, double amount) throws InsufficientFundsException;
}
