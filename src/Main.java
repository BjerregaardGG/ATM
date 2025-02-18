import java.util.Scanner;

public class Main {
    private static final String TXT_QUIT = "q";
    private static final String MSG_INPUT_CARDNUMBER = "Input card number (q=quit): ";
    private static final String MSG_INPUT_PINCODE = "Input pin code: ";
    private static final String MSG_INPUT_AMOUNT = "Input amount ($): ";
    private static final String ERR_AUTHENTICATION = "Authentication failed. Please try again.";
    private static final String ERR_INVALID_CARD = "Invalid card. Please try again.";
    private static final String MSG_QUIT_RECEIVED = "ATM quit received";

    public static void main(String[] args) {

        ITransactionProcessor transactionProcessor = new TransactionProcessor();
        ICardReader cardReader = new CardReader();
        ICashDispenser cashDispenser = new CashDispenser();
        ISecuritySystem securitySystem = new SecuritySystem();

        boolean quit = false;
        Scanner scanner = new Scanner(System.in);

        while(!quit) {
            System.out.println("*******************************");
            System.out.println("**   ATM Simulator Program   **");
            System.out.println("*******************************");
            System.out.println(MSG_INPUT_CARDNUMBER);
            String cardNumber = scanner.next();

            if(!cardNumber.equals(TXT_QUIT)) {
                System.out.println(MSG_INPUT_PINCODE);
                String pinCode = scanner.next();

                ICard card = cardReader.validateCard(cardNumber);
                if(card != null) {
                    IAccount account = card.getAccount();
                    if(securitySystem.authenticate(card.getPin(), pinCode)){

                        System.out.println(MSG_INPUT_AMOUNT);
                        double amount = Double.parseDouble(scanner.next());

                        transactionProcessor.processTransaction(account, amount);
                        cashDispenser.dispenseCash(amount);
                    } else {
                        System.out.println(ERR_AUTHENTICATION);
                    }
                } else {
                    System.out.println(ERR_INVALID_CARD);
                }
            } else {
                quit = true;
                System.out.println(MSG_QUIT_RECEIVED);
            }
        }
    }
}