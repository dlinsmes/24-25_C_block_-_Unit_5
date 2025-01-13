//composition - made up of objects
//of another class (multiple Card objects)
public class Deck {

    //objects and arrays can be instance vars
    private Card [] cards;

    private int top;

    public Deck() {
        top = 0;

        //initialize the cards array size
        cards = new Card[52];

        //populate the cards array with 13 cards of
        //each suit

        int deckIndex = 0;

        for (int i = 1; i <= 13; i++) {
            Card n = new Card("Spades", i);
            cards[deckIndex] = n;
            deckIndex++;
        }

        for (int i = 1; i <= 13; i++) {
            //don't need to make an extra variable/object first
            cards[deckIndex] = new Card("Hearts", i);
            deckIndex++;
        }

        for (int i = 1; i <= 13; i++) {
            cards[deckIndex] = new Card("Diamonds", i);
            deckIndex++;
        }

        for (int i = 1; i <= 13; i++) {
            cards[deckIndex] = new Card("Clubs", i);
            deckIndex++;
        }
    }

    public String toString() {
        String output = "Deck:";
        for (int i = 0; i < 52; i++) {
            output += "\n" + cards[i].toString();
        }
        return output;
    }

    public void shuffle() {
        for (int i = 0; i < 52; i++) {
            //swap the cards at indices i and r
            int r = (int)(Math.random() * 52);

            //temp var matches the array type
            Card temp = cards[i];
            cards[i] = cards[r];
            cards[r] = temp;
        }
    }

    //an object can be returned
    public Card draw() {
        Card drawn = cards[top];

        //advance the top position
        top++;

        return drawn;

        //this won't return the correct card
//        top++;
//        return cards[top];

    }
}
