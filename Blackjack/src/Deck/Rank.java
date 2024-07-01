package Deck;

public enum Rank {
    ACE("Ace(A)", 11),
    KING("King(K)", 10),
    TEN("Ten(10)", 10),
    JACK("Jack(J)", 10),
    QUEEN("Queen(Q)", 10),
    TWO("Two(2)", 2),
    THREE("Three(3)", 3),
    FOUR("Four(4)", 4),
    FIVE("Five(5)", 5),
    SIX("Six(6)", 6),
    SEVEN("Seven(7)", 7),
    EIGHT("Eight(8)", 8),
    NINE("Nine(9)", 9);


    String rankName;
    int rankValue;

    Rank(String rankName, int rankValue) {
        this.rankName = rankName;
        this.rankValue = rankValue;
    }
    public String toString(){
        return rankName;
    }
}
