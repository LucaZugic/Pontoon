package com.bham.pij.assignments.pontoon;
// Luca Walter Zugic 2218894
import java.util.ArrayList;

public class Card {
	
	public Suit su;
	public Value val;
	
    public Card(Suit suit, Value value) {
    	su = suit;
    	val = value;
    }
    
    public static enum Suit {
        CLUBS,
        HEARTS,
        DIAMONDS,
        SPADES
    }

    public static enum Value {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }

    public Value getValue() {
        return val;
    }

    public Suit getSuit() {
        return su;
    }

    public ArrayList<Integer> getNumericalValue() {
        ArrayList<Integer> numVal = new ArrayList<Integer>();
        
        switch(val){
            case ACE:
                numVal.add(1);
                numVal.add(11);
                break;
            case TWO:
                numVal.add(2);
                break;
            case THREE:
                numVal.add(3);
                break;
            case FOUR:
                numVal.add(4);
                break;
            case FIVE:
                numVal.add(5);
                break;
            case SIX:
                numVal.add(6);
                break;
            case SEVEN:
                numVal.add(7);
                break;
            case EIGHT:
                numVal.add(8);
                break;
            case NINE:
                numVal.add(9);
                break;
            case TEN:
            case JACK:
            case QUEEN:
            case KING:
                numVal.add(10);
                break;
            }
        return numVal;
    }
}
