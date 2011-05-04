package com.openestimation.engine;


/**
 * @author mohamed
 *
 * This enum defines card suits
 *
 */
public enum Suit {
	// Suite definitions
	SPADES(1),
	HEARTS(2),
	DIAMONDS(3),
	CLUBS(4);
	
	int suit;
	
	private Suit(int suit){
		this.suit = suit;
	}
	
	public int getSuit() {
		return this.suit;
	}
}
