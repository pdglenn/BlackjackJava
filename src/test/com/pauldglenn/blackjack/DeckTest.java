package com.pauldglenn.blackjack;

import static org.junit.Assert.*;
import org.junit.Test;

public class DeckTest {
    @Test
    public void aNewDeckHas52Cards(){

        assertEquals(52, new Deck().size());
    }

    @Test
    public void topCardOfNewDeckIsAceOfSpades(){
        assertEquals(new Card(1, "S"), new Deck().nextCard());
    }

    @Test
    public void removingACardReducesSizeOfDeck(){
        Deck d = new Deck();
        d.nextCard();
        assertEquals(51, d.size());
    }

    @Test
    public void deckCanBeShuffledAndTopCardIsNoLongerAceSpaces(){
        Deck d = new Deck();
        d.shuffle();
        assertNotEquals(new Card(1, "S"), d.nextCard());
    }
}
