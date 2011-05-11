/**
 * 
 */
package com.openestimation.engine.testing;

import com.openestimation.engine.Card;
import com.openestimation.engine.CardDeck;
import com.openestimation.engine.PlayerDirection;
import com.openestimation.engine.Rank;
import com.openestimation.engine.Suit;
import com.openestimation.engine.Trick;

/**
 * @author mohamed
 * This is a class intended to test contents of engine.
 * Please add your code in a separate method then call it from main(). 
 */
public class Test implements Suit, Rank, PlayerDirection{
    public static void main(String[] args) {
            System.out.println("Hello Open Estimation.");
            testCard();

            System.out.println("\n==================\n");
            testCardDeck();
            
            System.out.println("\n==================\n");
            testTrick();
        }

    /**
     * This method tests the Card class.
     */
    private static void testCard() {
            System.out.println("Testing a Card object...");

            Card card = new Card();
            card.setRank(Rank.ACE_HIGH);
            card.setSuit(Suit.CLUBS);
            System.out.println("Rank is " + card.getRank());
            System.out.println("Suit is " + card.getSuit());

            System.out.println(
                    "In other words, rank is " + card.rankToString());
            System.out.println(
                    "In other words, suit is " + card.suitToString());
    }

    /**
     * This method is to test the CardDeck class
     */
    private static void testCardDeck(){
            System.out.println("Testing a CardDeck object...");

            CardDeck cardDeck = new CardDeck();

            if (cardDeck.isInitialized()) {
                    int counter= 0;
                    while (!cardDeck.isEmpty()) {
                            counter++;
                            Card card = cardDeck.deal();
                            System.out.println(
                                    "Dealt this card from Deck:");
                            System.out.println(
                                    "Card Number:" + counter);
                            System.out.println(
                                    "\tRank:" + card.rankToString());
                            System.out.println(
                                    "\tSuit:" + card.suitToString());
                    }
            }

            System.out.println("\nRe-initializing Deck...");
            cardDeck.initialize();

            // Dealing 13 cards around
            if (cardDeck.isInitialized()) {
                    final int handMax = 13;
                    int playerCounter = 0;

                    while (!cardDeck.isEmpty()) {
                            playerCounter++;
                            System.out.println(
                                    "\nThis hand is to Player " 
                                    + playerCounter);
                            System.out.println(
                                    "Card Number\t:\tRank\t:\tSuit");
                            for (int i = 0; i < handMax; i++){
                                    Card card = cardDeck.deal();
                                    System.out.println((i+1) 
                                            + "\t\t:\t" 
                                            + card.rankToString() 
                                            + "\t:\t" 
                                            + card.suitToString());
                            }
                    }
            }
    }
    
    /**
     * Tests the Trick class
     */
    private static void testTrick(){
        Trick trick = new Trick();
        
        // Cards to add
        Card firstCard = new Card(TWO, CLUBS);
        Card secondCard = new Card(THREE, CLUBS);
        Card thirdCard = new Card(TWO, HEARTS);
        thirdCard.setIsTrump(true);
        Card forthCard = new Card(FOUR, CLUBS);
        
        // Add cards to trick
        trick.collectCard(firstCard, SOUTH);
        trick.collectCard(secondCard, EAST);
        trick.collectCard(thirdCard, NORTH);
        trick.collectCard(forthCard, WEST);
        
        // get winning card.
        Card winningCard = trick.getWinningCard();
        
        System.out.println("Winning Rank is " + winningCard.getRank());
        System.out.println("Winning Suit is " + winningCard.getSuit());
    }
}
