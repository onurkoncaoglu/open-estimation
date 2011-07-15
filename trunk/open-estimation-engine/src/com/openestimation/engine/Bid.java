/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openestimation.engine;

/**
 * This class provides a structure of Bids placed by Players.
 * TODO: GameAuthority has an array of bids.
 * @author mohamed
 */
public class Bid {
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
