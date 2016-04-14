package com.pauldglenn.blackjack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by paulglenn on 4/14/16.
 */
public class HandTest {
    @Test
    public void aHandWithNoCardsHasSizeZero(){
        assertEquals(0, new Hand().size());
    }

    @Test
    public void aHandWithOneCardHasSizeOne(){
        Hand h = new Hand();
        h.add(new Card(1, "S"));
        assertEquals(1, h.size());
    }
}
