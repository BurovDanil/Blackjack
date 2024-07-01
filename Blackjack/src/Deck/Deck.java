package Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    int count;

    public Deck(){
        cards = new ArrayList<>();
    }
    public ArrayList<Card> getCards() {
        return cards;
    }
    public void addCard(Card card){
        cards.add(card);
    }
    public void makeDeck(){
        for(int i = 0; i < 8; i++)
            for (Suit suit : Suit.values()){
                for (Rank rank : Rank.values()){
                    Card card = new Card(suit, rank);
                    cards.add(card);
                    count++;
                }
            }
    }
    public int getCount(){
        return count;
    }
    public void shuffleDeck(){
        Collections.shuffle(cards, new Random());
    }
    //You are always drawing the first card
    //That is why you are removing the first card
    public Card drawCard(){
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }
    public String toString(){
        String deckString = "";
        for (Card card : cards){
            deckString += card.toString() + "\n";
        }
        return "Deck: " + "\n" + "\n" + deckString + "\n" + "End of Deck";
    }
}
