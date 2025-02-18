package cardreader;

import Card.ICard;

public interface ICardReader {


    public ICard validateCard(String cardNr);
}
