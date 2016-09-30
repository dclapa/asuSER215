/**
 * 
 */

/**
 * @author dclapa
 *
 */
public class Card {
	private Suit suit;
	private Rank rank;
	private int points;
	
	public Card()
	{
		//instantiate with a random suit and rank (a random card)
		this.points = 0;
	}
	
	public Card(Suit suit, Rank rank)
	{
		this.suit = suit;
		this.rank = rank;
		this.points = 0;	
	}
	
	public Card(Suit suit, Rank rank, int points)
	{
		this.suit = suit;
		this.rank = rank;
		this.points = points;
	}
	
	public void setSuit(Suit suit)
	{
		this.suit = suit;
	}
	
	public Suit getSuit()
	{
		return suit;
	}
	
	public void setRank(Rank rank)
	{
		this.rank = rank;
	}
	
	public Rank getRank()
	{
		return rank;
	}
	
	public void setPoints(int points)
	{
		this.points = points;
	}
	
	
	public int getPoints()
	{
		int points = 0;
		if (rank == Rank.TWO)
			points = 2;
		else if (rank == Rank.THREE)
			points = 3;
		else if (rank == Rank.FOUR)
			points = 4;
		else if (rank == Rank.FIVE)
			points = 5;
		else if (rank == Rank.SIX)
			points = 6;
		else if (rank == Rank.SEVEN)
			points = 7;
		else if (rank == Rank.EIGHT)
			points = 8;
		else if (rank == Rank.NINE)
			points = 9;
		else if (rank == Rank.TEN || rank == Rank.JACK || rank == Rank.QUEEN || rank == Rank.KING)
			points = 10;
		else if (rank == Rank.ACE)
			points = 1; //set to minimum, add 10 points to it if needed, depending on other card/s in hand
		return points;
	}
	
}
