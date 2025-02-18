package Card;

public class Card implements ICard{

    private String cardNr;
    private String pin;
    //private Account account;

    public Card(String cardNr, String pin){
        this.cardNr = cardNr;
        this.pin = pin;

    }


    @Override
    public String getCardNr() {
        return cardNr;
    }

    public void setCardNr(String cardNr) {
        this.cardNr = cardNr;
    }

    @Override
    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }


    /*
    @Override
    public account getAccount() {
        return account;
    }

    public void setAccount(account account) {
        this.account = account;
    }
*/

}
