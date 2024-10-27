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
     * Method creating new, sorted deck of cards.
     * @return new instance Deck with sorted deck od cards
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
     * method shuffling already existing Deck
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * method draws first card from the deck if possible
     * @return Card | Null
     */
    public Card drawCard() {
        if (cards.isEmpty()) {return null;}
        return cards.remove(0);
    }

    public Boolean isEmpty() {
        return cards.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Deck:\n");
        for (Card card : cards) {
            sb.append(card).append("\n");
        }
        return sb.toString();
    }
}
