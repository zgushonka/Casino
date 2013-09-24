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
	
	protected OperationResult registerPlayer(Player player)
	{
		return players.add(player) ?
				OperationResult.PLAYER_REGISTERED :
				OperationResult.PLAYER_ALREADY_REGISTERED;
	}
	
	public void flushAllPlayers () {
		players.clear();
	}	
	
	
	protected void addBet(Bet bet, Player player)
	{
		bets.add(bet);
		betsToPlayer.put( bet.getId(), player.getId() );		
	}
	
	
	
	private boolean enableManualSpin;	
	
	public boolean isManualSpin() {
		return enableManualSpin;
	}

	public void setManualSpin(boolean manualSpin) {
		this.enableManualSpin = manualSpin;
	}
	
	
/*	
	protected void playGame () {
		//
		Iterator<Bets> 
	}
/*	*/
	
	// all TODO
	// force roulette Spin
		//	with time period 5s				- prime table
		//	by user command "all bets done" - test table
	
	// calculate wins
	
}
