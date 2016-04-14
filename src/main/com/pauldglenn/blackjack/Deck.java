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
                cards.add(new Card(i, suit));
            }
        }
    }

    public int size() {
        return cards.size();
    }

    public Card nextCard() {
        Card next;
        next = cards.get(0);
        cards.remove(0);
        return next;
    }

}
