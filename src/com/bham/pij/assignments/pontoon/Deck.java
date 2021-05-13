package com.bham.pij.assignments.pontoon;
// Luca Walter Zugic 2218894

import java.util.ArrayList;
import java.util.Random;
import com.bham.pij.assignments.pontoon.Card.Suit;
import com.bham.pij.assignments.pontoon.Card.Value;
public class Deck {
	public static ArrayList<Card> deck = new ArrayList<Card>();
	Random rand = new Random();
	public Deck() {
		makeDeck();
	}
	public void makeDeck(){
		deck.clear();
		deck.add(new Card(Suit.HEARTS, Value.ACE));
		deck.add(new Card(Suit.HEARTS, Value.TWO));
		deck.add(new Card(Suit.HEARTS, Value.THREE));
		deck.add(new Card(Suit.HEARTS, Value.FOUR));
		deck.add(new Card(Suit.HEARTS, Value.FIVE));
		deck.add(new Card(Suit.HEARTS, Value.SIX));
		deck.add(new Card(Suit.HEARTS, Value.SEVEN));
		deck.add(new Card(Suit.HEARTS, Value.EIGHT));
		deck.add(new Card(Suit.HEARTS, Value.NINE));
		deck.add(new Card(Suit.HEARTS, Value.TEN));
		deck.add(new Card(Suit.HEARTS, Value.JACK));
		deck.add(new Card(Suit.HEARTS, Value.QUEEN));
		deck.add(new Card(Suit.HEARTS, Value.KING));
		deck.add(new Card(Suit.DIAMONDS, Value.ACE));
		deck.add(new Card(Suit.DIAMONDS, Value.TWO));
		deck.add(new Card(Suit.DIAMONDS, Value.THREE));
		deck.add(new Card(Suit.DIAMONDS, Value.FOUR));
		deck.add(new Card(Suit.DIAMONDS, Value.FIVE));
		deck.add(new Card(Suit.DIAMONDS, Value.SIX));
		deck.add(new Card(Suit.DIAMONDS, Value.SEVEN));
		deck.add(new Card(Suit.DIAMONDS, Value.EIGHT));
		deck.add(new Card(Suit.DIAMONDS, Value.NINE));
		deck.add(new Card(Suit.DIAMONDS, Value.TEN));
		deck.add(new Card(Suit.DIAMONDS, Value.JACK));
		deck.add(new Card(Suit.DIAMONDS, Value.QUEEN));
		deck.add(new Card(Suit.DIAMONDS, Value.KING));
		deck.add(new Card(Suit.CLUBS, Value.ACE));
		deck.add(new Card(Suit.CLUBS, Value.TWO));
		deck.add(new Card(Suit.CLUBS, Value.THREE));
		deck.add(new Card(Suit.CLUBS, Value.FOUR));
		deck.add(new Card(Suit.CLUBS, Value.FIVE));
		deck.add(new Card(Suit.CLUBS, Value.SIX));
		deck.add(new Card(Suit.CLUBS, Value.SEVEN));
		deck.add(new Card(Suit.CLUBS, Value.EIGHT));
		deck.add(new Card(Suit.CLUBS, Value.NINE));
		deck.add(new Card(Suit.CLUBS, Value.TEN));
		deck.add(new Card(Suit.CLUBS, Value.JACK));
		deck.add(new Card(Suit.CLUBS, Value.QUEEN));
		deck.add(new Card(Suit.CLUBS, Value.KING));
		deck.add(new Card(Suit.SPADES, Value.ACE));
		deck.add(new Card(Suit.SPADES, Value.TWO));
		deck.add(new Card(Suit.SPADES, Value.THREE));
		deck.add(new Card(Suit.SPADES, Value.FOUR));
		deck.add(new Card(Suit.SPADES, Value.FIVE));
		deck.add(new Card(Suit.SPADES, Value.SIX));
		deck.add(new Card(Suit.SPADES, Value.SEVEN));
		deck.add(new Card(Suit.SPADES, Value.EIGHT));
		deck.add(new Card(Suit.SPADES, Value.NINE));
		deck.add(new Card(Suit.SPADES, Value.TEN));
		deck.add(new Card(Suit.SPADES, Value.JACK));
		deck.add(new Card(Suit.SPADES, Value.QUEEN));
		deck.add(new Card(Suit.SPADES, Value.KING));
	}
	public void reset() {
		makeDeck();
	}
	public void shuffle() {
		for (int i = 0; i < deck.size(); i++) {
			Card current = deck.get(i);
			deck.remove(i);
			deck.add(rand.nextInt(deck.size()-2), current);
		}
	}
	public Card getCard(int i) {
		Card cardToGet;
		if (deck.size() > 0){
			cardToGet = deck.get(i);
		} else {
			cardToGet = null;
		}
		return cardToGet;
	}
	public Card dealRandomCard() {
		int index = rand.nextInt(deck.size()-1);
		Card toDeal = deck.get(index);
		deck.remove(index);
		return toDeal;
	}
	public int size() {
		return deck.size();
	}
}
