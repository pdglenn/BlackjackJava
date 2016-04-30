package com.pauldglenn.blackjack;

import java.util.ArrayList;

// Understands how to report the aggregate value of held cards
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
        int aceCount = 0;

        for (Card card : cards){
            if (card.value() == 1) aceCount++;
            total += card.value();
        }

        while (total <= 21 && aceCount > 0){
            total += 10;
            aceCount--;
        }
        return total;
    }

    public boolean isBlackjack() {
        return (cards.size() == 2 && this.value() == 21);
    }

    @Override
    public String toString(){
        String result = "";
        for (Card card : cards){
            result += card.toString() + " ";
        }
        result += this.value();
        return result;
    }
}

