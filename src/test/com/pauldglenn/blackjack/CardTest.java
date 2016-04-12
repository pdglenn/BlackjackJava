package com.pauldglenn.blackjack;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CardTest {
    @Test
    public void twoOfHeartsHasValueOfTwo(){
        assertEquals(2, new Card(2, "H").value());
    }

    @Test
    public void queenOfHeartsHasValueOf10(){
        assertEquals(10, new Card(12, "H").value());
    }

}
