package Player;

import java.util.ArrayList;

import Cards.Card;

public class Hand
{
	public final static int MIN_CARDS_COUNT_IN_HAND = 0;
	public final static int MAX_CARDS_COUNT_IN_HAND = 8;

	private ArrayList<Card> cardInHand = null;

	public Hand()
	{
		cardInHand = new ArrayList<Card>();
	}

	public ArrayList<Card> getCardInHand()
	{
		return cardInHand;
	}

	public void setCardInHand(ArrayList<Card> pCardInHand)
	{
		this.cardInHand = pCardInHand;
	}

	public static boolean validateCardInHand(ArrayList<Card> cardsList)
	{
		return (cardsList.size() >= MIN_CARDS_COUNT_IN_HAND
				&& cardsList.size() <= MAX_CARDS_COUNT_IN_HAND);
	}

	public Card playACard(Card pCard)
	{
		Card playedCard = null;
		for (Card card : cardInHand)
		{
			if (pCard.getColor() == card.getColor()
					&& pCard.getNumber() == card.getNumber()
					&& pCard.getValue() == card.getValue())
			{
				playedCard = card;
				cardInHand.remove(card);
			}
		}
		return playedCard;
	}
	
	public void addCardToHand (Card pCard)
	{
		cardInHand.add(pCard);
	}
}
