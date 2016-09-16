package Player;

import java.util.ArrayList;

public class Team 
{
	private static int MAX_NUM_PLAYER_TEAM = 2;
	private ArrayList<Player> team = null;
	
	public Team (Player p_teamMate1, Player p_teamMate2)
	{
		team = new ArrayList<Player>(MAX_NUM_PLAYER_TEAM);
		team.add(p_teamMate1);
		team.add(p_teamMate2);
	}
	
	public Team()
	{
		team = new ArrayList<Player>(MAX_NUM_PLAYER_TEAM);
	}
	
	public void addPlayer(Player p_player)
	{
		team.add(p_player);	
	}
	
	public int teamPoints()
	{
		int points = 0;
		for (Player player : team)
		{
			points += player.getPoints();
		}
		return points;
	}
	
	
}
