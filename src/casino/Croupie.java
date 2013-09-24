package casino;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

//import javax.swing.text.StyledEditorKit.BoldAction;

import bets.Bet;

public class Croupie {
	
	//	list of registered players
	private Set<Player> players = new HashSet<Player>();
	
	//	list of bets for next Spin
	private List<Bet> bets = new ArrayList<Bet>();
	
	//	binding bet to player
	private Map<UUID, UUID> betsToPlayer = new HashMap<UUID, UUID>();
	
	protected void registerPlayer(Player player)
	{
		boolean PlayerAdded = players.add(player);
		
		if ( !PlayerAdded ) {
			// TODO exception
		}
	}
	
	public void flushAllPlayers () {
		players.clear();
	}	
	
		
	protected void addBet(Bet bet, Player player)
	{
		bets.add(bet);
		betsToPlayer.put( bet.getId(), player.getId() );		
	}
	
	
	
	private boolean manualSpin;	
	
	public boolean isManualSpin() {
		return manualSpin;
	}

	public void setManualSpin(boolean manualSpin) {
		this.manualSpin = manualSpin;
	}
	
	

	
	// all TODO
	// force roulette Spin
		//	with time period 5s				- prime table
		//	by user command "all bets done" - test table
	
	// calculate wins
	
}
