public class Card {

    private String suit;
    private String rank;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
        if (value == 1)
            rank = "ace";
        else if (value == 11)
            rank = "jack";
        else if (value == 12)
            rank = "queen";
        else if (value == 13)
            rank = "king";
        else
            rank = "" + value;
    }

    public String getSuit() { return suit; }
    public String getRank() { return rank; }
    public int getValue() { return value; }

    //mutator aka set method for suit

    //param is optional - matches the data type of
    //the instance variable
    public void setSuit(String newsuit) {
        suit = newsuit;
    }


    public String toString() {
        return rank + " of " + suit;
    }
}
