/**
 * TODO: make it impossible to create instance od Player, Deck or Card outside of the Table
 */

package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class Table {
    private final Set<Player> tablePlayers;
    private final Deck tableDeck;

    public Table(Set<String> playerNames) {
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
