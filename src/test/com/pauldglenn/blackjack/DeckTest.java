package com.pauldglenn.blackjack;

import static org.junit.Assert.*;
import org.junit.Test;

public class DeckTest {
    @Test
    public void aNewDeckHas52Cards(){

        assertEquals(52, new Deck().size());
    }
    @Test
    public void test2(){
        assertEquals(2, 2);
    }
}
