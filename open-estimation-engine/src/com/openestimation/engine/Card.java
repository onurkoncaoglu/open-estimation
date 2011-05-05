/**
 * 
 */
package com.openestimation.engine;

/**
 * @author mohamed
 * 
 * This class represents a card that
 * has a suit and a rank.
 */
public class Card implements Rank, Suit{
	int rank;
	int suit;
	String imagePath;
	
	public String suitToString(){
		switch (suit) {
		case SPADES:
			return "Spades";
		case HEARTS:
			return "Hearts";
		case DIAMONDS:
			return "Diamonds";
		case CLUBS:
			return "Clubs";

		default:
			// TODO Manage invalid values here.
			return null;
			}
	}
	
	public String rankToString(){
		switch (rank) {
		case ACE_LOW:
			return "No Low Aces in this game";
		case TWO:
			return "Two";
		case THREE:
			return "Three";
		case FOUR:
			return "Four";
		case FIVE:
			return "Five";
		case SIX:
			return "Six";
		case SEVEN:
			return "Seven";
		case EIGHT:
			return "Eight";
		case NINE:
			return "Nine";
		case TEN:
			return "Ten";
		case JACK:
			return "Jack";
		case QUEEN:
			return "Queen";
		case KING:
			return "King";
		case ACE_HIGH:
			return "Ace";

		default:
			// TODO Manage invalid values here.
			return null;
		}
	}
}
