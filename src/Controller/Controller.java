package Controller;
import java.util.ArrayList;

import com.apple.eawt.Application;

import Player.*;
import sun.applet.Main;


public class Controller extends Application 
{
	private static int MAX_NUM_PLAYERS = 4;
	private Player player1 = null;
	private Player player2 = null;
	private Player player3 = null;
	private Player player4 = null;
	private ArrayList<Player> playersArrayList = null;
	private Team team1 = null;
	private Team team2 = null;
	
	public Controller(String p_pseudo1, String p_pseudo2, String p_pseudo3, String p_pseudo4)
	{
		player1 = createPlayer(p_pseudo1);
		player2 = createPlayer(p_pseudo2);
		player3 = createPlayer(p_pseudo3);
		player4 = createPlayer(p_pseudo4);
		playersArrayList = new ArrayList<Player>(MAX_NUM_PLAYERS);
		playersArrayList.add(player1);
		playersArrayList.add(player2);
		playersArrayList.add(player3);
		playersArrayList.add(player4);
		
		//create teams randomly or chosen by the players
	}
	
	public Player createPlayer(String pPseudo)
	{
		Player player = new Player(pPseudo, 0);
		return player;
	}
	
	public void createRandomTeams()
	{
		for (int i = 0; i < MAX_NUM_PLAYERS; i++)
		{
			int rng = (int) Math.floor(Math.random() * playersArrayList.size() - i);
			try
			{
				team1.addPlayer(playersArrayList.get(rng));
			}
			catch (IndexOutOfBoundsException e)
			{
				team2.addPlayer(playersArrayList.get(rng));
			}	
		}
	}
	
	public void createChosenTeams(Player p_player1, Player p_player2)
	{
		
	}
	
	/**
	public boolean validateWinCondition()
	{
		
	}
	**/
	
	public static void main(String[] args)
	{
		
		
		
		
	}
	
}
