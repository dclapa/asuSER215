/**
 * 
 */

/**
 * @author dclapa
 *
 */
public class HumanPlayer extends Player {
	
	public HumanPlayer()
	{
		super();
	}
	
	public HumanPlayer(Card card)
	{
		super(card);
	}
	
	public HumanPlayer(Card card, int score)
	{
		super(card, score);
	}
	
	public void displayHand()
	{
		System.out.print("Card one: " + getCard(0).getRank() + " of " + getCard(0).getSuit());
		System.out.println(". Card two: " + getCard(1).getRank() + " of " + getCard(1).getSuit());
	}
}
