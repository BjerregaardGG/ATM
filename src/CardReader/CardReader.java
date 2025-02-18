package CardReader;


import Card.ICard;
import Card.Card;

import java.util.HashMap;
import java.util.Map;

public class CardReader implements ICardReader {

    Map<String, ICard> validCards = new HashMap<String, ICard>() {{
        validCards.put("1234", new Card("1234", "4321"));
        validCards.put("4444", new Card("4444", "8888"));
    }};

    @Override
    public ICard validateCard(String cardNr) {
        if (cardNr != null && validCards.containsKey(cardNr)) {
            return validCards.get(cardNr);


        }
        return null;
    }
}
