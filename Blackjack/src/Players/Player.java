package Players;
import Deck.Deck;
import java.util.Scanner;

public class Player extends Person{
    public int bet;
    
    public Player(){
        super.setName("Player");
        super.hand = new Hand();
        super.money = 1000;

    }
    public int getBet(){
        return this.bet;
    }
    public int setBet(int bet){
        return this.bet = bet;
    }
    public int getMoney(){
        return this.money;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public String getHandString(){
        return this.getHand().toString();
    }
    public void makeDecision(Deck deck, Deck discardDeck){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option: \n 1. Hit \n 2. Stand");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                super.hit(deck, discardDeck);
                break;
            case 2:
                break;
        }
    }
}
