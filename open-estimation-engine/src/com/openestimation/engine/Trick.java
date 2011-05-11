/**
 * 
 */
package com.openestimation.engine;

import java.util.ArrayList;


/**
 * @author mohamed
 * This class represent a card that is being played,
 * or a trick that is collected. Trick state determines its visibility.
 * A trick can only have four cards.
 * A trick must have a base suite.
 * A trick can only be collected by one player.
 */
public class Trick implements Suit, Rank{

    public static final int cardCount = 4;

    ArrayList<Card> trick;
    
    boolean collected;
    
    Card firstCard;
    
    int baseSuit;
    
    // TODO: verify usability 
    int firstPlayerDirection;
    
    int trump;
    boolean hasTrump;

    public boolean isCollected() {
        return collected;
    }
    
    public Trick() {
        trick = new ArrayList<Card>();
        for (int i = 0; i < cardCount; i++)
            trick.add(null);
        
        collected = false;
        hasTrump = false;
    }
    
    public void collectCard(Card card, int playerDirection){
        
        // check if we are trying to add cards to a full trick.
        if (trick.size() <= cardCount){
            
            // If this is the first card; store its information
            if (firstCard == null){
                firstCard = card;
                baseSuit = card.suit;
                firstPlayerDirection = playerDirection;
            }
            
            // check if this is a trump
            if (card.getIsTrump()){
                trump = card.suit;
                hasTrump = true;
            }
            
            // insert card into trick based on player position.
            trick.set(playerDirection, card);
        }
        else{
            // TODO: throw an exception or do something here.
        }
    }
    
    /**
     * Gets the winning card at any point during play. 
     * Only if trick was not collected 
     * @return A Card object.
     */
    public Card getWinningCard(){
        // return winning card only when trick is in-play and not yet collected.
        if (!this.isCollected()){
           
            // Determine winning suit
            int winningSuit;
            if (this.hasTrump)
                winningSuit = this.trump;
            else
                winningSuit = this.baseSuit;
            
            // Determine highest rank within the winning suite.
            //int winningRank = TWO;
            Card winningCard = new Card();
            winningCard.setRank(TWO); // Lowest value possible for a rank.
            for(Card card : trick){
                if (card.getSuit() == winningSuit){
                    if (winningCard.getRank() <= card.getRank()) {
                        winningCard = card;
                    }
                }
            }
            
            // Return winning card
            return winningCard;
         }
        return null;
    }
}
