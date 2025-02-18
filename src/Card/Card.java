package Card;

public class Card {

    private int cardNr;
    private int password;
    private Account account;

    public Card(int cardNr, int password){

    }

    public int getCardNr() {
        return cardNr;
    }

    public void setCardNr(int cardNr) {
        this.cardNr = cardNr;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public account getAccount() {
        return account;
    }

    public void setAccount(account account) {
        this.account = account;
    }


}
