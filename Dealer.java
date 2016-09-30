/**
 * 
 */

/**
 * @author dclapa
 *
 */
public class Dealer extends Player {
	
	
	public Dealer()
	{
		super();
	}
	
	public Dealer(Card card)
	{
		super(card);
	}
	
	public Dealer(Card card, int score)
	{
		super(card, score);
	}
	
	
	public void displayFirstCard()
	{
		System.out.print("First card is: " + getCard(0).getRank());
		System.out.println(" of " + getCard(0).getSuit());
	}
	
	public void displaySecondCard()
	{
		System.out.println("Second card is: " + getCard(1).getRank() + " of " + getCard(1).getSuit());
	}
	
}