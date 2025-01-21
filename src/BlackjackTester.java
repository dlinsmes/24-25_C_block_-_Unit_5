public class BlackjackTester {

    public static void main(String [] args) {

        BlackjackPlayer b = new BlackjackPlayer("lebron");

        System.out.println(b.getName());

        System.out.println(b);

        Card c = new Card("hearts", 9);

        b.addCard(c);

        System.out.println(b);

        Card c2 = new Card("hearts", 1);

        b.addCard(c2);

        System.out.println(b);

        System.out.println(b.getScore());

        b.addCard(c2);
        System.out.println(b);

        b.addCard(c2);
        System.out.println(b);

        b.addCard(c2);
        System.out.println(b);



    }
}
