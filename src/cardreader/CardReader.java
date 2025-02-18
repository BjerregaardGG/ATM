package cardreader;


import Card.ICard;
import Card.Card;
import account.Account;
import customer.Customer;

import java.util.HashMap;
import java.util.Map;

public class CardReader implements ICardReader {

    /*private final Map<String, ICard> validCards = new HashMap<String, ICard>() {{
        validCards.put("1234", new Card("1234", "4321"));
        validCards.put("4444", new Card("4444", "8888"));
    }};
    */
    private final Map<String, ICard> validCards = new HashMap<String, ICard>()
    {{
        put("1234567890123456", new Card("1234567890123456", "1234", new Account(new Customer(1, "John", "Doe"), 1000.0)));
        put("9876543210987654", new Card( "9876543210987654", "4321", new Account(new Customer(1, "Jack", "Smith"), 2000.0)));
    }};

    @Override
    public ICard validateCard(String cardNr) {
        if (cardNr != null && validCards.containsKey(cardNr)) {
            return validCards.get(cardNr);


        }
        return null;
    }
}
