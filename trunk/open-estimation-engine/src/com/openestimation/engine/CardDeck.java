/**
 * 
 */
package com.openestimation.engine;

import java.util.ArrayList;

/**
 * @author mohamed
 * Represents Card deck used for dealing each hand.
 * Deck will be completely used after dealing to four players.
 * Each 'Player' will 'take' 13 'Cards'.
 */
final public class CardDeck {
	
        private ArrayList<Card> deck;
	
	private boolean initialized;
	public boolean isInitialized() {
		return initialized;
	}

	private boolean empty;

	public boolean isEmpty() {
		return empty;
	}


	public CardDeck() {
		deck = new ArrayList<Card>();
		initialize();
	}


	public void initialize() {
		deck.clear(); // TODO check for exceptions
		// Initialize Spades
		for (int rank = Rank.TWO; rank <= Rank.ACE_HIGH; rank++){
			Card card = new Card(); // to be added to deck.
			card.rank = rank;
			card.suit = Suit.SPADES; // hard coded loop for spades
			deck.add(card);
		}
		// Initialize Hearts
		for (int rank = Rank.TWO; rank <= Rank.ACE_HIGH; rank++){
			Card card = new Card(); // to be added to deck.
			card.rank = rank;
			card.suit = Suit.HEARTS; // hard coded loop for hearts
			deck.add(card);
		}
		// Initialize Diamonds
		for (int rank = Rank.TWO; rank <= Rank.ACE_HIGH; rank++){
			Card card = new Card(); // to be added to deck.
			card.rank = rank;
			card.suit = Suit.DIAMONDS; // hardcode loop for diamonds
			deck.add(card);
		}
		// Initialize Clubs
		for (int rank = Rank.TWO; rank <= Rank.ACE_HIGH; rank++){
			Card card = new Card(); // to be added to deck.
			card.rank = rank;
			card.suit = Suit.CLUBS; // hard coded loop for clubs
			deck.add(card);
		}
		this.initialized = true;
		this.empty = false;
	}
	
	/**
	 * Gets a random card from deck.
         * This method actually removes the card.
	 * @return
	 * Returns a random card
	 */
	public Card getCard() {
		Card card;
		
		// Exit if deck is empty.
		if (this.isEmpty())
			return null;
		
		int min = 0; // first index in deck
		int max = deck.size(); // TODO Check for exceptions.
				
		// Check to see if deck is empty
		if (max <= 1)
			this.empty = true;
	
                // Pick a random position into deck
                int position = min + (int)(Math.random() * max);
		card = deck.remove(position); // TODO Check for exceptions.
		this.initialized = false;
		return card;
	}
}
