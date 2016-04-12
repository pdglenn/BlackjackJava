package com.pauldglenn.blackjack;

// Understands how to store the value and suit of a card
public class Card {

    private final int rank;
    private final String suit;
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int value() {
        if (rank >= 10) return 10;
        return rank;
    }
}
