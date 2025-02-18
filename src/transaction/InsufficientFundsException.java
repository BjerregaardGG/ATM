package transaction;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException() {
        super("The funds are insufficient to complete transaction.");
    }
}
