package Deck;

//Constructing the Rank and the Suit of the card
//We need a getter for everything in order to use it later.

public class Card {
    Suit suit;
    Rank rank;


    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public int getRankValue() {
        return rank.rankValue;
    }
    public String getRankName() {
        return rank.rankName;
    }
    public Suit getSuit() {
        return suit;
    }
    public String toString() {
        return rank.rankName + " " + suit.className;
    }
}
