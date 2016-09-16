package Deck;

import java.util.ArrayList;
import java.util.Collections;

import Cards.*;

public class CardDeck
{

	private ArrayList<Card> deck = null;
	

	public CardDeck()
	{
		this.resetDeck();
	}
	
	public ArrayList<Card> getDeck()
	{
		return deck;
	}

	public void setDeck(ArrayList<Card> deck)
	{
		this.deck = deck;
	}

	public void removeCardToCardDeck(Card pCard)
	{
		for (Card card : deck)
		{
			if (pCard.getColor() == card.getColor() 
					&& pCard.getNumber() == card.getNumber()
					&& pCard.getValue() == card.getValue())
			{
				deck.remove(card);
			}
		}
		
	}
	
	public Card giveCardToHand()
	{
		int rng = (int) Math.floor(Math.random() * deck.size());
		Card randomCard = deck.get(rng);
		deck.remove(rng);
		return randomCard;
	}
	
	public void resetDeck()
	{
		deck = new ArrayList<Card>();
		
		for (int i = 0; i < (Cards.Card.MAX_NUMBER + 1); i++)
		{
			if(i == 0)
			{
				RedCard redCard = new RedCard(i, Cards.Card.JOFFRE_CARD_VALUE);
				BrownCard brownCard = new BrownCard(i, Cards.Card.KAISER_CARD_VALUE);
				deck.add(redCard);
				deck.add(brownCard);
				
			}
			else
			{
				RedCard redCard = new RedCard(i, Cards.Card.NORMAL_CARD_VALUE);
				BrownCard brownCard = new BrownCard(i, Cards.Card.NORMAL_CARD_VALUE);
				deck.add(redCard);
				deck.add(brownCard);
			}
			
			GreenCard greenCard = new GreenCard(i, Cards.Card.NORMAL_CARD_VALUE);
			BlueCard blueCard = new BlueCard(i, Cards.Card.NORMAL_CARD_VALUE);
			deck.add(greenCard);
			deck.add(blueCard);
		}
		
		for (int i = 0; i < 5; i++)
		{
			Collections.shuffle(deck);
		}
	}
}
	
	
	
