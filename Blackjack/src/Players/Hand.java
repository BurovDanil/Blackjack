package Players;
import Deck.Card;
import Deck.Deck;
import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<Card>();
    }
    
    //Drawing of a card
    public void takeCardFromDeck(Deck deck){
        hand.add(deck.drawCard());
    }

    //Discarding hand to deck
    public void discardHandToDeck(Deck discardDeck){
        for (Card card : hand){
            discardDeck.addCard(card);
        }
        hand.clear();
    }
    //Calculating the value of the hand
    public int calculateValueOfHand(){
        int value = 0;
        for(Card card : hand){
            value += card.getRankValue();
        }
        return value;
    }
    public String toString(){
        return hand.toString();
    }
    public Card getCard(int idx){
        return hand.get(idx);
    }
}
