/**
 * Blackjack Game
 * 
 */

/**
 * @author dclapa
 *
 */
public abstract class Player {
	
	private Card[] cards = new Card[24];	//a player must have an array of card objects, at maximum 24 (52 - 4 = 48 / 2 = 24)
	private int numOfCards = 0;				//represents the index of the Card[] array. index=0 represents card 0 (the first card)
								    		// index=1 is the second card, and so on
	private int totalScore = 0;
	
	//default constructor sets totalScore to 0
	public Player()
	{
		totalScore = 0;
	}
		
	//second constructor, where you can "send" multiple cards to a player
	public Player(Card card)
	{
		cards[numOfCards] = card;
		numOfCards++;
		totalScore = 0;
	}
		
	//third constructor, we may not need this one
	public Player(Card card, int score)
	{
		numOfCards = 0;
		cards[numOfCards] = card;
		totalScore = score;
	}
	
	public void handCard(Card card)
	{
		cards[numOfCards] = card;
		numOfCards++;
		
		//this.totalScore += card.getPoints(); //not working
		//addToScore(card.getPoints());
		//addToScore(card[newCard].getPoints())
	}
	
	public Card getCard(int cardNum)
	{
		return cards[cardNum];
	}
	
	public int getNumberOfCardsInHand()
	{
		return numOfCards;
	}
	
	//public interface to set score value
	public void setScore(int score)
	{
		this.totalScore = score;
	}
	
	//public interface to get score value
	//calculate and return the score value of all cards in a player's hand
	public int getScore()
	{
		int totalScore = 0;
		for (int i = 0; i < numOfCards; i++)
		{
			totalScore += cards[i].getPoints();
		}
		return totalScore;
	}
	
	//should we return something if totalScore is greater than 21? 
	//or, let the Game check and take appropriate action?
	public void addToScore(int score)
	{
		if (score > 0) {
			totalScore += score;
		}
		else {
			System.out.println("cannot add a negative score");
		}	
	}
	
	//display next card as indicated by the number sent into this function
	public void displayLastCard(int next)
	{
		System.out.println("Next card is: " + getCard(next).getRank() + " of " + getCard(next).getSuit());
	}
}
