package com.pauldglenn.blackjack;

// Understands how to store the value and suit of a card
public class Card {

    public final int rank;
    public final String suit;
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int value() {
        if (rank >= 10) return 10;
        return rank;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Card)) return false;
        return rank == ((Card) obj).rank && suit == ((Card) obj).suit;
    }

    public String toString(){
        return "Card: " + rank + suit;
    }
}
