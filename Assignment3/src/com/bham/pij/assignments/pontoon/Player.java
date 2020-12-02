package com.bham.pij.assignments.pontoon;
// Luca Walter Zugic 2218894
import java.util.ArrayList;
import com.bham.pij.assignments.pontoon.Card.Value;

public class Player {
	String playerName;
	ArrayList<Card> cards = new ArrayList<Card>();
	ArrayList<Integer> numHandVal = new ArrayList<Integer>();
	public Player(String name) {
		playerName = name;
	}
	public String getName() {
		return playerName;
	}
	public void dealToPlayer(Card card) {
		cards.add(card);
	}
	public void removeCard(Card card) {
		cards.remove(card);
	}
	public ArrayList<Card> getCards() {
		return cards;
	}
	public ArrayList<Integer> getNumericalHandValue() {
		numHandVal.clear();
		int aceCount = 0;
		int currentSum = 0;
		for (int i = 0; i < cards.size(); i++) {
			currentSum += cards.get(i).getNumericalValue().get(0);
			if (cards.get(i).getValue() == Value.ACE) {
				aceCount ++;
			}
		}
		numHandVal.add(currentSum);
		if (aceCount > 0) {
			for (int i = 0; i < aceCount; i++) {
				currentSum += 10;
				numHandVal.add(currentSum);
			}
		}
		return numHandVal;
	}
	public int getBestNumericalHandValue() {
		int bestVal = 0;
		getNumericalHandValue();
		for (int i = 0; i < numHandVal.size(); i++) {
			if ((numHandVal.get(i) > bestVal)&(numHandVal.get(i) <= 21)) {
				bestVal = numHandVal.get(i);
			}
		}
		return bestVal;
	}
	public int getHandSize() {
		return cards.size();
	}

}
