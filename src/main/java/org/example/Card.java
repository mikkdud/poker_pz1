package org.example;

import java.util.Objects;

/**
 * Class represents a playing card with attributes:
 * rank
 * suit
 */
public class Card {
    /**
     * The rank of the card.
     */
    private final Ranks rank;

    /**
     * The suit of the card.
     */
    private final Suits suit;

    /**
     * Constructs a Card with the specified rank and suit
     *
     * @param rank the rank of the card, e.g., ACE
     * @param suit the suit of the card, e.g., HEARTS
     */
    public Card(Ranks rank, Suits suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * @return the rank of the card
     */
    public Ranks getRank() {
        return rank;
    }

    /**
     * @return the suit of the card
     */
    public Suits getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    /**
     * Compares this card to the specified object.
     *
     * @param o the object to compare with
     * @return true if the specified object is equal to this card, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank && suit == card.suit;
    }

    /**
     * @return a hash code value for this card based on its rank and suit.
     */
    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    /**
     * Enum representing the four possible suits of a card.
     */
    public enum Suits {
        SPADES, HEARTS, CLUBS, DIAMONDS
    }

    /**
     * Enum representing the thirteen possible ranks of a card.
     */
    public enum Ranks {
        DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }
}