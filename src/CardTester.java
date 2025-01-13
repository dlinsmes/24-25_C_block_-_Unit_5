public class CardTester {
    public static void main(String [] args) {

        Card c = new Card("spades", 1);

        System.out.println(c);

        //change the suit using the mutator method
        c.setSuit("diamonds");
        System.out.println(c);

        System.out.println();

        Deck d = new Deck();
        System.out.println(d);

        System.out.println();

        d.shuffle();
        System.out.println(d);

        Card [] hand = new Card[5];
        //draw a card to fill each position in the hand

        System.out.println();

        for (int i = 0; i < 5; i++) {
//            Card newC = d.draw();
//            hand[i] = newC;
//
            //this does the same thing
            hand[i] = d.draw();
            System.out.println(hand[i]);
        }


        System.out.println();

        //for-each loop
        for (Card ca: hand)
            System.out.println(ca);

    }
}
