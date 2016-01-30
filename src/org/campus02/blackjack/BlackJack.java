package org.campus02.blackjack;

import java.util.HashMap;

public class BlackJack {
	private HashMap<Player, Integer> players = new HashMap<>();
	
	boolean add(Player player){
		if(players.containsKey(player)){
			return false;
		}
		else{
			players.put(player, 0);
		}		
		return true;
	}
	
	boolean addCard(Player player, Integer cardValue){
		if (players.containsKey(player)){
			Integer currentValue=players.get(player);
			players.put(player, currentValue+cardValue);
			return true;
		}
		return false;
	}
	
	Integer getValue(Player player){
		if(players.containsKey(player)){
		return players.get(player);
		}
		else return null;
	}

	@Override
	public String toString() {
		return "BlackJack [players=" + players + "]";
	}
	
	

}
