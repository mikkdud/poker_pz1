package org.example;

public class Card {
    /**
     * Class represents a Card with attributes:
     * rank
     * suit
     */
    private final Ranks rank;
    private final Suits suit;

    public Card(Ranks rank, Suits suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // getters
    public Ranks getRank() {
        return rank;
    }
    public Suits getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

     public enum Suits {
        SPADES, HEARTS, CLUBS, DIAMONDS
    }

    public enum Ranks {
        DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }
}