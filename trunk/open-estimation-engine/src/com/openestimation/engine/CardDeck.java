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
public class CardDeck implements Rank, Suit{
	Vector<Card> deck;
	
	boolean initialized;
	public boolean isInitialized() {
		return initialized;
	}

	boolean empty;

	public boolean isEmpty() {
		return empty;
	}


	public CardDeck() {
		deck = new Vector<Card>();
		initialize();
	}


	public void initialize() {
		deck.clear(); // TODO check for exceptions
		// Initialize Spades
		for (int rank = TWO; rank <= ACE_HIGH; rank++){
			Card card = new Card(); // to be added to deck.
			card.rank = rank;
			card.suit = SPADES; // hard coded loop for spades
			deck.add(card);
		}
		// Initialize Hearts
		for (int rank = TWO; rank <= ACE_HIGH; rank++){
			Card card = new Card(); // to be added to deck.
			card.rank = rank;
			card.suit = HEARTS; // hard coded loop for hearts
			deck.add(card);
		}
		// Initialize Diamonds
		for (int rank = TWO; rank <= ACE_HIGH; rank++){
			Card card = new Card(); // to be added to deck.
			card.rank = rank;
			card.suit = DIAMONDS; // hard coded loop for diamonds
			deck.add(card);
		}
		// Initialize Clubs
		for (int rank = TWO; rank <= ACE_HIGH; rank++){
			Card card = new Card(); // to be added to deck.
			card.rank = rank;
			card.suit = CLUBS; // hard coded loop for clubs
			deck.add(card);
		}
		this.initialized = true;
		this.empty = false;
	}
	
	/**
	 * Deals one card at a time.
	 * @return
	 * Returns a dealt card
	 */
	public Card deal() {
		Card card;
		
		// Exit if deck is empty.
		if (this.isEmpty())
			return null;
		
		// Pick a random position into deck
		int min = 0; // first index in deck
		int max = deck.size(); // TODO Check for exceptions.
		int position = min + (int)(Math.random() * max);
		
		// Check to see if deck is empty
		if (max <= 1)
			this.empty = true;
	
		card = deck.remove(position); // TODO Check for exceptions.
		this.initialized = false;
		return card;
	}
}
