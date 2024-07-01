import Deck.Deck;
import Players.Dealer;
import Players.Player;
import Players.Hand;
import java.util.Scanner;

public class Table {
    private Deck deck;
    private Deck discardDeck;
    private Dealer dealer;
    private Player player;
    int betForRound;

    private int wins, losses, pushes;

    public Table(){
        deck = new Deck();
        discardDeck = new Deck();
        dealer = new Dealer();
        player = new Player();
        wins = 0;
        losses = 0;
        pushes = 0;
        betForRound = 0;

        deck.makeDeck();
        deck.shuffleDeck();
        System.out.println(deck.getCount());

    }
    public void startRound(){
        while(true){
        int playerMoney = player.getMoney();
        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();
        player.setHand(playerHand);
        dealer.setHand(dealerHand);

        System.out.println("Starting round");
        Scanner scanner = new Scanner(System.in);
        // Your code here
        
        System.out.println("Player's turn");
        System.out.println("How much would you like to bet? (Max 100)");

        int bet = scanner.nextInt();
        player.bet(bet);
        player.setBet(bet);

        System.out.println("You bet: " + bet);
        betForRound = bet;

        System.out.println("Player's cards: ");
        playerHand.takeCardFromDeck(deck);
        playerHand.takeCardFromDeck(deck);
        player.printHand();

        System.out.println("Dealer's cards: ");
        dealerHand.takeCardFromDeck(deck);
        dealerHand.takeCardFromDeck(deck);
        dealer.printFirstHand();

        while(playerHand.calculateValueOfHand() < 21){
            player.makeDecision(deck, discardDeck);
            player.printHand();
            if (player.hasQuit()) {
                System.out.println("Player chose to quit. Ending game.");
                break;
            }
            if(player.hasBlackjack()){
                System.out.println("Blackjack!");
                player.setMoney(playerMoney + betForRound * 3 / 2);
                wins++;
                System.out.println(playerMoney);
                break;
            }
            else if(playerHand.calculateValueOfHand() > 21){
                System.out.println("Player busts");
                playerMoney -= betForRound;
                System.out.println(playerMoney);
                losses++;
                break;
            }
        }
        if(player.hasQuit()){
            System.out.println("Player quits");
            break;
        }
        System.out.println("Dealer's turn");
    }
    player.resetQuit(); //reset the flag for the next round
    }
}
