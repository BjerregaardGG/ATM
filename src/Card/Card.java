package Card;

import account.Account;
import account.IAccount;

public class Card implements ICard{

    private String cardNr;
    private String pin;
    private IAccount account;

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



    @Override
    public IAccount getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


}
