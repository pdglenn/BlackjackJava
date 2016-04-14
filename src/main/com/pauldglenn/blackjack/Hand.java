package com.pauldglenn.blackjack;

import java.util.ArrayList;

/**
 * Created by paulglenn on 4/14/16.
 */
public class Hand {

    private ArrayList<Card> cards = new ArrayList<>();

    public Hand(){

    }

    public int size() {
        return cards.size();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public int value() {
        int total = 0;
        for (Card card : cards){
            total += card.value();
        }
        return total;
    }
}
