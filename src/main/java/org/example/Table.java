/**
 * TODO:
 * make it impossible to create instance of Player, Deck or Card outside of the Table
 * make an easier way to introduce players in constructor
 * limit amount of players to 10
 */

package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class Table {
    /**
     * Table represents a table of players which includes given attributes:
     * tablePlayers : Set<Player>, representing players at the table
     * tableDeck : Deck, represents deck assigned to the table
     */
    private final Set<Player> tablePlayers;
    private final Deck tableDeck;

    public Table(Set<String> playerNames) {
        /**
         * constructor automatically shuffles deck of cards
         */
        this.tableDeck = Deck.createSortedDeck();
        this.tableDeck.shuffle();
        this.tablePlayers = new LinkedHashSet<>();
        for (String playerName : playerNames) {
            tablePlayers.add(Player.createPlayerWithHand(this.tableDeck, playerName));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Table: \n\n");
        for (Player player : this.tablePlayers) {
            sb.append(player.toString());
            sb.append("---------\n");
        }
        return sb.toString();
    }
}
