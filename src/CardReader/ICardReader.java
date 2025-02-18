package CardReader;

import Card.Card;

public interface ICardReader {


    public Card validateCard(int cardNr, int pin);
}
