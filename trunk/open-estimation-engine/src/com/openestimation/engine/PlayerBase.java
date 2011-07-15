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
     * from hand and return it to the GameAuthority calling object. 
     * That card must be validated prior to return. It is the player's
     * responsibility to return a valid card.
     * If a returned card is not valid then the GameAuthority will throw an
     * exception. (TODO: define exception).
     * @param trick is the current trick in play.
     * @return 
     */
    abstract public Card play(Trick trick);
    
    /**
     * This method will be used by the GameAuthority to ask a Player to place
     * a bid based on currentBid. Player bid is returned.
     * @param currentBid is the last bid placed by previous Player.
     * It is up to the player to save the final winning bid. 
     * If currentBid is null then the previous player passes.
     * @return 
     * Player returns chosen bid here. if return is null then the Player passes.
     */
    abstract public Bid placeBid(Bid currentBid);
    
    private int score;

    public void setScore(int score) {
        this.score = score;
    }
    
    public int getScore() {
        return score;
    }

    private Hand hand;
    
    public Hand getHand() {
        return hand;
    }
    
    public void setHand(Hand hand){
        this.hand = hand;
    }
}
