/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openestimation.engine;

import java.util.ArrayList;

/**
 * This class provides a vector (ArrayList really) of Cards that are held
 * by a Player.
 * A Player can Sort Cards.
 * A Player can Retrieve a certain Suit from Hand.
 * A Player can Play a Card (removing it from Hand). 
 * A player can Insert card back in Hand if not Valid (rejected by RuleSet).
 * 
 * @author mohamed
 */
final public class Hand {
    private ArrayList<Card> hand;
    private static final int maximumCards = 13;
    private Card undoCard;

    public Hand() {
        hand = new ArrayList();
        undoCard = null;
    }
    
    
    
    public void sortHand(){
        // TODO: Implement sortHand()
    }
    
    /**
     * Draws a card from hand (actually removing it).
     * @param card
     * @return 
     */
    public Card drawCard(Card card){
        if (hand.contains(card)){
            hand.remove(card); // remove card from hand.
            undoCard = card; // Store removed card in case user wants to undo.
            return card; // returns the card that was found in hand.
        }
        return null;
    }
    
    /**
     * Draws a card from hand (actually removing it).
     * @param suit
     * @param rank
     * @return 
     */
    public Card drawCard(int suit, int rank){
        Card card = new Card(suit, rank);
        card = this.drawCard(card);
        return card;
    }
    
    /**
     * Undoes last draw from hand. Useful if card does not validate and user
     * wants to undo the draw.
     */
    public void undoDraw(){
        hand.add(undoCard);
        this.sortHand();
        undoCard = null;
    }
    
    /**
     * Checks of a certain suit exists in a Hand.
     * @param suit: The suit to check for.
     * @return Returns true if it found at least on card of the
     * specified suit. Returns false otherwise.
     */
    public boolean isSuitExist(int suit){
        for (Card card : hand) {
            if (card.getSuit() == suit)
                return true;
        }
        return false;
    }
    
    /**
     * Gets card count in a suit.
     * @param suit: The suit to count.
     * @return card count. Returns 0 if none exist.
     */
    public int getCardCountForSuit(int suit){
        int cardCounter = 0;
        for (Card card : hand){
            if (card.getSuit() == suit)
                cardCounter++;
        }
        return cardCounter;
    }
    
    /**
     * Gets the highest Rank for a specified Suit in Hand.
     * User should check first if suit exists. Otherwise, user will get -1 for
     * non-existing suit.
     * @param suit: The suit to get the highest card from.
     * @return Highest rank returned. If suit does not exist, -1 is returned.
     */
    public int getHighestRankInSuit(int suit) {
        Card highCard = new Card();
        highCard.setRank(Rank.TWO);
        int rank = -1;
        for (Card card : hand){
            if (card.suit == suit){
                if (card.rank >= highCard.rank){
                    highCard = card;
                    rank = highCard.getRank();
                }
            }
        }
        return rank;
    }
    
    /**
     * Returns an ArrayList containing all cards in a suit.
     * @param suit
     * @return 
     */
    public ArrayList<Card> getAllCardsInSuit(int suit){
        ArrayList<Card> list = new ArrayList<Card>();
        for (Card card : hand){
            if (card.suit == suit){
                list.add(card);
            }
        }
        if (list.size() > 0)
            return list;
        else
            return null;
    }
    
    public void addCard(Card card){
        if (hand.size() < maximumCards)
            hand.add(card);
        //else
            //TODO: throw an exception here.
    }
}
