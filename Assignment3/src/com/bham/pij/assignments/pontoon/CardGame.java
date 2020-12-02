package com.bham.pij.assignments.pontoon;
// Luca Walter Zugic 2218894

import java.util.ArrayList;

public abstract class CardGame {
	public Deck deck;
	public int playerNum;
	ArrayList<Player> players = new ArrayList<Player>();
	public CardGame(int nplayers) {
		playerNum = nplayers;
		deck = new Deck();
		deck.shuffle();
		for (int i = 0; i < playerNum; i++) {
			players.add(new Player("Player " + String.valueOf(i+1)));	
		}
	}
	
	public abstract void dealInitialCards();
	
	public abstract int compareHands(Player hand1, Player hand2);
	
	public Deck getDeck() {
		return deck;
	}
	
	public int getNumPlayers() {
		return playerNum;
	}
}
