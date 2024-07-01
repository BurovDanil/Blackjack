package Deck;

public enum Suit {
    CLUB("\u2663"),
    DIAMOND("\u2666"),
    HEART("\u2665"), 
    SPADE("\u2660");

    String className;

    Suit(String className) {
        this.className = className;
    }
    public String toString(){
        return className;
    }
}

