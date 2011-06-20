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
final public class Trick {

    private static final int cardCount = 4;

    private ArrayList<Card> trick;

    public ArrayList<Card> getTrick() {
        return trick;
    }
        
    private Card firstCard;
        
    private String firstPlayerDirection;

    public String getFirstPlayerDirection() {
        return firstPlayerDirection;
    }

    public void setFirstPlayerDirection(String firstPlayerDirection) {
        this.firstPlayerDirection = firstPlayerDirection;
    }
    
    public Trick() {
        trick = new ArrayList<Card>();
        firstCard = null;
    }
    
    /**
     * @param card
     * @param playerDirection 
     */
    public void collectCard(Card card){
        
        // check if we are trying to add cards to a full trick.
        if (trick.size() <= cardCount){
            
            // If this is the first card; store its information
            if (firstCard == null){
                firstCard = card;
            }
            
            // Add card to trick
            trick.add(card);            
        }
        else{
            // TODO: throw an exception or do something here.
        }
    }
}
