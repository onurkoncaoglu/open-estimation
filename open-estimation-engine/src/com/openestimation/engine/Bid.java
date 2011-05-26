/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openestimation.engine;

/**
 * This class provides a structure of Bids placed by Players.
 * TODO: RuleSet has an array of bids.
 * @author mohamed
 */
class Bid implements Trump {
    private int trump;

    public void setTrump(int trump) {
        this.trump = trump;
    }

    public int getTrump() {
        return trump;
    }
    
    private int tricks;

    public void setTricks(int tricks) {
        this.tricks = tricks;
    }

    public int getTricks() {
        return tricks;
    }
                
}
