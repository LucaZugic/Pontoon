package com.bham.pij.assignments.pontoon;
// Luca Walter Zugic 2218894

public class Pontoon extends CardGame {
	public Pontoon(int nplayers) {
		super(nplayers);
		dealInitialCards();
	}
	@Override
	public int getNumPlayers() {
		return playerNum;
	}
	@Override
	public Deck getDeck() {
		return deck;
	}
	@Override
	public void dealInitialCards() {
		deck.shuffle();
		for (Player player : players) {
			player.dealToPlayer(deck.dealRandomCard());
			player.dealToPlayer(deck.dealRandomCard());
		}
	}
	@Override
	public int compareHands(Player hand1, Player hand2) {
		int respond = 0;
		/* switch (getRank(hand1)) {
			case 1:
			if (getRank(hand2) != 1) {
				respond = -1;
			}
			break;
			case 2:
			break;
			case 3:
			break;
			case 4:
			break;
			case 0:
			break;
		} */
		if (hand1.getBestNumericalHandValue() == hand2.getBestNumericalHandValue()) {
			if (hand1.getBestNumericalHandValue() == 21) {
				switch(hand1.getHandSize()){
					case 2:
						if (hand2.getHandSize() != 2) {
							respond = -1;
						}
						break;
					case 5:
						if (hand2.getHandSize() != 2){
							if (hand2.getHandSize() != 5) {
								respond = -1;
							}
						} else {
							respond = 1;
						}
						break;
				}
			}
		} else if (hand1.getBestNumericalHandValue() > hand2.getBestNumericalHandValue()) {
			respond = -1;
		} else if (hand1.getBestNumericalHandValue() < hand2.getBestNumericalHandValue()) {
			respond = 1;
		}
		return respond;
	}
	/* public byte getRank() {
		byte rank = 0;
		rank = ;
		return rank;
	} */
}
