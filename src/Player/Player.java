package Player;
import Cards.*;

public class Player
{
	public final static int MIN_LENGHT_NAME = 2;
	public final static int MAX_LENGHT_NAME = 30;
	public final static int MAX_POINTS_COUNT = 12;
	public final static int MIN_POINTS_COUNT = 0;

	private String name;
	private int points = 0;
	private Hand hand = null;

	public Player(String pName, int pPoints)
	{
		hand = new Hand();
		
		if(validateName(pName) && validatePoints(pPoints))
		{
			this.name = pName;
			this.points = pPoints;
		}
		//else throw a playerException
	}

	public String getName()
	{
		return name;
	}

	public void setName(String pName)
	{
		if (validateName(pName))
		{
			this.name = pName;
		}

	}

	public int getPoints()
	{
		return points;
	}

	public void setPoints(int pPoints)
	{
		if (validatePoints(pPoints))
		{
			this.points = pPoints;
		}
	}

	public static boolean validateName(String pName)
	{
		return (pName.length() >= MIN_LENGHT_NAME
				&& pName.length() <= MAX_LENGHT_NAME);
	}

	public static boolean validatePoints(int pPoints)
	{
		return (pPoints >= MIN_POINTS_COUNT && pPoints <= MAX_POINTS_COUNT);
	}

	public Hand getHand()
	{
		return hand;
	}

	public void setHand(Hand pHand)
	{
		hand = pHand;
	}
	
	public void playerAddCardToHand(Card pCard)
	{
		hand.addCardToHand(pCard);
	}
	
	public void playerPlayCard(Card pCard)
	{
		hand.playACard(pCard);
	}

	public void resetPoints()
	{
		this.setPoints(0);
	}
}
