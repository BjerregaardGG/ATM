package Card;

import account.Account;
import account.IAccount;

public interface ICard {

    public String getCardNr();

    public IAccount getAccount();

    public String getPin();
}
