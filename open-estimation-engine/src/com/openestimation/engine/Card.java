/**
 * 
 */
package com.openestimation.engine;

/**
 * @author mohamed
 * 
 * This class represents a card that
 * has a suit and a rank.
 */
public final class Card implements Rank, Suit{
    int rank;
    int suit;
    boolean isTrump;

    /**
     * Default constructor. Leaves all null.
     */
    public Card() {
    }

    /**
     * Constructor that sets Suit and Rank;
     * @param rank
     * @param suit
     */
    public Card(int rank, int suit) {
        this.setSuit(suit);
        this.setRank(rank);
    }

    public void setIsTrump(boolean trump) {
        this.isTrump = trump;
    }

    public boolean getIsTrump() {
        return isTrump;
    }

    String imagePath;

    public int getRank() {
            return rank;
    }

    public void setRank(int rank) {
            if (rank >= ACE_LOW && rank <= ACE_HIGH) {
                    this.rank = rank;
            } else {
                    this.rank = -1;
            }
    }

    public int getSuit() {
            return suit;
    }

    public void setSuit(int suit) {
            if (suit == SPADES 
                            || suit == HEARTS
                            || suit == DIAMONDS
                            || suit == CLUBS) {
                    this.suit = suit;
            } else {
                    this.suit = -1;
            }
    }

    public String getImagePath() {
            return imagePath;
    }

    public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
    }

    /**
     * @return
     * Returns a string representation for suit.
     */
    public String suitToString(){
            switch (suit) {
            case SPADES:
                    return "Spades";
            case HEARTS:
                    return "Hearts";
            case DIAMONDS:
                    return "Diamonds";
            case CLUBS:
                    return "Clubs";

            default:
                    // TODO Manage invalid values here.
                    return null;
                    }
    }

    /**
     * @return
     * Returns a string representation for rank.
     * @return
     */
    public String rankToString(){
            switch (rank) {
            case ACE_LOW:
                    return "No Low Aces in this game";
            case TWO:
                    return "Two";
            case THREE:
                    return "Three";
            case FOUR:
                    return "Four";
            case FIVE:
                    return "Five";
            case SIX:
                    return "Six";
            case SEVEN:
                    return "Seven";
            case EIGHT:
                    return "Eight";
            case NINE:
                    return "Nine";
            case TEN:
                    return "Ten";
            case JACK:
                    return "Jack";
            case QUEEN:
                    return "Queen";
            case KING:
                    return "King";
            case ACE_HIGH:
                    return "Ace";

            default:
                    // TODO Manage invalid values here.
                    return null;
            }
    }
}
