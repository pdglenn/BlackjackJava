package com.pauldglenn.blackjack;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    @Test
    public void aNewDeckHas52Cards(){
        assertEquals(52, new Deck().size());
    }
}
