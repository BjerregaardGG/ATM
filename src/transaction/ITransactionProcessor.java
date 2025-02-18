package transaction;

public interface ITransactionProcessor {
   boolean processTransaction(double amount) throws InsufficientFundsException;
}
