package test;
import Deck.*;
import Cards.*;
import Player.*;

public class test
{
	public static void main (String [] args)
	{
		Player player1 = new Player("phil", 0);
		Player player2 = new Player("dav", 0);
		Player player3 = new Player("zo", 0);
		Player player4 = new Player("fil", 0);
		CardDeck deck = new CardDeck();
		
		/**
		for (int i = 0; i < 32; i++)
		{
			System.out.print(deck.getDeck().get(i).getColor() + " ");
			System.out.print(deck.getDeck().get(i).getNumber() + " ");
		}
		System.out.print("\n" + "\n");
		**/
		
		for (int i = 0; i < (Card.MAX_NUMBER) + 1; i++)
		{
			player1.playerAddCardToHand(deck.giveCardToHand());
			player2.playerAddCardToHand(deck.giveCardToHand());
			player3.playerAddCardToHand(deck.giveCardToHand());
			player4.playerAddCardToHand(deck.giveCardToHand());
		}
		
		System.out.print(player1.getName() + ":" + "\n");
		for (int i = 0; i < (Card.MAX_NUMBER) + 1; i++)
		{
			System.out.print(player1.getHand().getCardInHand().get(i).getColor() + " ");
			System.out.print(player1.getHand().getCardInHand().get(i).getNumber() + " ");
		}
		System.out.print("\n");
		
		System.out.print(player2.getName() + ":" + "\n");
		for (int i = 0; i < (Card.MAX_NUMBER) + 1; i++)
		{
			System.out.print(player2.getHand().getCardInHand().get(i).getColor() + " ");
			System.out.print(player2.getHand().getCardInHand().get(i).getNumber() + " ");
		}
		System.out.print("\n");
		
		System.out.print(player3.getName() + ":" + "\n");
		for (int i = 0; i < (Card.MAX_NUMBER) + 1; i++)
		{
			System.out.print(player3.getHand().getCardInHand().get(i).getColor() + " ");
			System.out.print(player3.getHand().getCardInHand().get(i).getNumber() + " ");
		}
		System.out.print("\n");
		
		System.out.print(player4.getName() + ":" + "\n");
		for (int i = 0; i < (Card.MAX_NUMBER) + 1; i++)
		{
			System.out.print(player4.getHand().getCardInHand().get(i).getColor() + " ");
			System.out.print(player4.getHand().getCardInHand().get(i).getNumber() + " ");
		}
		
		System.out.print("\n" + "test de git");
		System.out.print("\ntest de zo ");
		System.out.print("\neille zo t'es zo ca marche");
		
	}
}
