
import Deck.Deck;
import Players.Hand;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "Blackjack!" + "\n");

        Table table = new Table();

        Deck deck = new Deck();

        Hand hand = new Hand();

        deck.makeDeck();
        deck.shuffleDeck();

        hand.takeCardFromDeck(deck);
        System.out.println(hand.toString());
        hand.takeCardFromDeck(deck);
        System.out.println(hand.toString());

        System.out.println(hand.calculateValueOfHand());


        // System.out.println("Deck in order (START): \n");
        // deck.makeDeck();
        // System.out.println(deck.toString());

        // System.out.println("Deck in order (END): \n");

        // System.out.println("Deck shuffled(START) \n");

        // deck.shuffleDeck();
        // System.out.println(deck.toString());

        // System.out.println("Deck shuffled(END) \n");

        // System.out.println(deck.getCount());
    }
}
