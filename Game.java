/**
 * 
 */

/**
 * @author dclapa
 *
 */
public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HumanPlayer player = new HumanPlayer();
		Dealer dealer = new Dealer();
		
		//add random selection to this:
		Card card1 = new Card(Suit.CLUB, Rank.ACE); //ACE score is 1, at first
		Card card2 = new Card(Suit.HEART, Rank.TWO); //TWO score is 2 ... 1 + 2 = 3
		Card card3 = new Card(Suit.DIAMOND, Rank.EIGHT); //8
		Card card4 = new Card(Suit.SPADE, Rank.QUEEN);   //+ 10 = 18
		
		player.handCard(card1);
		player.handCard(card2);
		
		dealer.handCard(card3);
		dealer.handCard(card4);
			
		//display cards
		System.out.print("The player's hand is: ");
		player.displayHand();
		
		System.out.println("The dealers' first card is: ");
		dealer.displayFirstCard();
		System.out.println("The dealers' second card is: ");
		dealer.displaySecondCard();
		
		//get and print out the scores
		System.out.println("The player's current score is: " + player.getScore());
		System.out.println("The dealer's current score is: " + dealer.getScore());
		
		System.out.println("The player is holding " + player.getNumberOfCardsInHand() + " cards.");
		System.out.println("The dealer is holding " + dealer.getNumberOfCardsInHand() + " cards.");
		
		//simulation of a Hit
		Card card5 = new Card(Suit.DIAMOND, Rank.SEVEN);
		System.out.println("Card 5's points is: " + card5.getPoints());
		
		//give a card to the player
		player.handCard(card5); //2 represent the 3rd card given to the player
		System.out.println("The player's next card, after he requested a Hit is: ");
		player.displayLastCard(2);
		System.out.println("The player is holding " + player.getNumberOfCardsInHand() + " cards.");
		System.out.println("The player's current score is: " + player.getScore());
		
		Card cardTest = new Card(Suit.SPADE, Rank.JACK);
		HumanPlayer playerTest = new HumanPlayer(cardTest); //testing this constructor
		Card cardTest1 = new Card(Suit.DIAMOND, Rank.FOUR);
		playerTest.handCard(cardTest1);
		System.out.print("The new player's hand is: ");
		playerTest.displayHand();
		
		
		
	}
}
