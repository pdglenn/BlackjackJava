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
}
