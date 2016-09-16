package Deck;

import java.util.ArrayList;

import Cards.Card;

public class DiscardPile
{
	private ArrayList<Card> discardPile = null;
	
	public DiscardPile()
	{
		discardPile = new ArrayList<Card>();
	}

	public ArrayList<Card> getDiscardPile() 
	{
		return discardPile;
	}

	public void setDiscardPile(ArrayList<Card> discardPile) 
	{
		this.discardPile = discardPile;
	}
	
	
	public void addCardToDiscardPile(Card pCard)
	{
		discardPile.add(pCard);
	}
}
