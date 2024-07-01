package Players;
import Players.Hand;
import Deck.Deck;
import Players.Player;

public abstract class Person {
    public String name;
    public Hand hand;
    public int money;

    public Person(){
        hand = new Hand();
        this.name = "";
        this.money = 1000;
    }
public Hand getHand(){
    return hand;
}
public void setHand(Hand hand){
    this.hand = hand;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
public void bet(int bet){
    this.money -= bet;
}
public void hit(Deck deck, Deck discardDeck){
    hand.takeCardFromDeck(deck);
}
public boolean hasBlackjack(){
    if(this.getHand().calculateValueOfHand() == 21){
        return true;
    }
    else{
        return false;
    }
}
public void printHand(){
    System.out.println(this.name + "'s hand looks like this: ");
    System.out.println(this.hand + " Value: " + this.hand.calculateValueOfHand());
}

}

