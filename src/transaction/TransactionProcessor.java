package transaction;

public class TransactionProcessor implements ITransactionProcessor{
    public boolean processTransaction(IAccount account, double amount) {
        return true;
    }
}
