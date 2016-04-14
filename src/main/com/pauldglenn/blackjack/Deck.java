package com.pauldglenn.blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// Understands how to hold a deck of 52 unique cards
public class Deck {

    ArrayList<Card> cards = new ArrayList<>();

    public Deck(){
        List<String> suits = Arrays.asList("S", "H", "C", "D");
        for (String suit : suits){
            for (int i = 1; i < 14; i++){
                System.out.println("Adding: " + i + " " + suit);
                cards.add(new Card(i, suit));
            }
        }
    }

    public int size() {
        return 52;
    }

    public Card nextCard() {
        Card next;

        return cards.get(0);
    }

}
