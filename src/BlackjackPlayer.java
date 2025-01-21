import java.util.ArrayList;

public class BlackjackPlayer {

    private ArrayList<Card> hand;
    private String name;

    public BlackjackPlayer (String name) {
        this.name = name;
        //need to call the ArrayList constructor to
        //initialize and be able to add objects
        hand = new ArrayList<Card> ();
    }

    public String getName() { return name; }

    public void addCard(Card c) {
        //add the param Card object into the hand arraylist
        hand.add(c);
    }

    public int getScore() {
        //calculate the optimal score using the cards in the hand
        //-2-10 are worth the value for points
        //jqk are worth 10
        //ace is worth 1 or 11, whichever is more beneficial



        int score = 0;
        int nAces = 0;
        //loop through hand arraylist to access each card
        for (int i = 0; i < hand.size(); i++) {
            Card current = hand.get(i);
            int currentValue = current.getValue();

            //face cards: values 11, 12, 13
            if (currentValue > 10)
                score += 10;

            //numerical cards: 2-10
            else if (currentValue > 1)
                score += currentValue;

            //ace
            else
                //don't score aces until after the rest of the
            //hand has been scored
                nAces++;
        }

        //if you have more than one ace, at most count one as 11,
        //count the rest as 1

        //test:
        //9 and 1 ace --> 20
        //9 and 2 aces --> 21
        //9 and 3 aces --> 12
        //9 and 4 aces --> 13

        if (nAces > 1)
            score += nAces - 1;
        if (nAces >= 1) {
            if (score + 11 > 21)
                score += 1;
            else
                score += 11;
        }


        return score;
    }

    public String toString() {
        return "name: " + name + "\nScore: " + getScore() + "\nhand: " + hand;
    }
}
