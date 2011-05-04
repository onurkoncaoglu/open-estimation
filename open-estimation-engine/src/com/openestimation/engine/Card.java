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
public class Card {
	Rank rank;
	Suit suit;
	String imagePath;
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
}
