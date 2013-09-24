package casino;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import bets.Bet;

public class Croupie {
	
	// all TODO
	
	// list of players
	// 
	
	private Set<Player> players = new HashSet<Player>();
	private List<Bet> bets = new ArrayList<Bet>();
	private Map<UUID, UUID> betsToPlayer = new HashMap<UUID, UUID>();
	
	protected void registerPlayer(Player player)
	{
		
	}
	
	protected void addBet(Bet bet, Player player)
	{
		bets.add(bet);
		betsToPlayer.put(bet.getId(), player.getId());
		
		
		
	}
	
	
	
	
	
	// map of bets : player
	
	// force roulette Spin
		//	with time period 5s				- prime table
		//	by user command "all bets done" - test table
	
	// calculate wins
	
}
