/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openestimation.engine;

/**
 * This is a base class for the Player class.
 * This will provide methods to override by children AI players.
 * One special child class is the human Player.
 * This class provides a Hand object of Cards that the Player will use
 * to place Bids, play Rounds, Win and Lose Tricks.
 * A Player will be able to view scores.
 * 
 * TODO: Should we make this an abstract class?
 * 
 * @author mohamed
 */
public abstract class PlayerBase {

    public PlayerBase() {
    }
    
    /**
     * This method allows a Player to select a card
     * from hand and return it to the RuleSet caller object. 
     * That card must be validated prior to return. It is the player's
     * responsibility to return a valid card.
     * 
     * @param trick
     * @return 
     */
    abstract public Card play(Trick trick);
    abstract public Bid placeBid();
    
    private int score;

    public void setScore(int score) {
        this.score = score;
    }
    
    private Hand hand;

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Hand getHand() {
        return hand;
    }
}
