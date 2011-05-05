/**
 * 
 */
package com.openestimation.engine;

import java.util.Vector;

/**
 * @author mohamed
 * Represents Card deck used for dealing each hand.
 * Deck will be completely used after dealing to four players.
 * Each 'Player' will 'take' 13 'Cards'.
 */
public class CardDeck {
	Vector<Card> deck;
	
	/**
	 * Shuffles the deck.
	 * This functions resets the deck. Be careful.
	 */
	public void shuffle(){
		// TODO Implement
		// TODO handle exceptions
		deck.clear();
		
		//for (int i = Rank.ACE_LOW.get; i < array.length; i++) {
			
		//}
	}
	
	public Card deal(int cards) {
		// TODO Implement
		return null;
	}
}
