package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards;
    private Deck(List<Card> cards) {
        this.cards = cards;
    }


    /**
     * Creates a new, sorted deck of cards. Cards are ordered first by suit and then by rank.
     *
     * @return a new instance of Deck with cards in sorted order
     */
    public static Deck createSortedDeck() {
        List<Card> cards = new ArrayList<Card>();
        for (Card.Suits suit : Card.Suits.values()) {
            for (Card.Ranks rank : Card.Ranks.values()) {
                cards.add(new Card(rank, suit));
            }
        }
        return new Deck(cards);


    }
    /**
     * Shuffles the existing deck of cards in random order.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * Draws the first card from the deck, if available. Removes the drawn card from the deck.
     *
     * @return the first card in the deck, or null if the deck is empty
     */
    public Card drawCard() {
        if (cards.isEmpty()) {return null;}
        return cards.remove(0);
    }

    /**
     * Checks if the deck is empty.
     *
     * @return true if the deck has no remaining cards, false otherwise
     */
    public Boolean isEmpty() {
        return cards.isEmpty();
    }

    /**
     * Returns a string representation of the deck, listing each card on a new line.
     *
     * @return a string representation of the deck
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Deck:\n");
        for (Card card : cards) {
            sb.append(card).append("\n");
        }
        return sb.toString();
    }
}
