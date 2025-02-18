package transaction;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException() {
        super("No funds found");
    }
}
