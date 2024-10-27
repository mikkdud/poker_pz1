package org.example;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Deck deck1 = Deck.createSortedDeck();
//        System.out.println(deck1.toString());
//        System.out.println(" ----------------------- ");
//        deck1.shuffle();
//        System.out.println(deck1.toString());
//        Player Karol = Player.createPlayerWithHand(deck1, "Karol");
//        System.out.println(Karol.toString());
        Set<String> sampleSet = Set.of("Karol", "Iwo");
        Table table1 = new Table(sampleSet);
        System.out.println(table1.toString());

    }
}