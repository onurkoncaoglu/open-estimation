/**
 * 
 */
package com.openestimation.engine.testing;

import com.openestimation.engine.Card;
import com.openestimation.engine.Rank;
import com.openestimation.engine.Suit;

/**
 * @author mohamed
 * This is a class intended to test contents of engine.
 * Please add your code in a separate method then call it from main(). 
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("Hello Open Estimation.");
		testCard();
	    }

	/**
	 * This method tests the Card class.
	 */
	private static void testCard() {
		Card card = new Card();
		card.setRank(Rank.ACE_HIGH);
		card.setSuit(Suit.CLUBS);
		System.out.println(card.getRank().toString());
		System.out.println(card.getSuit().toString());	
	}
}
