package com.pauldglenn.blackjack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void aHandWithTwoFivesHasValueTen(){
        Hand h = new Hand();
        h.add(new Card(5, "H"));
        h.add(new Card(5, "S"));
        assertEquals(10, h.value());
    }

    @Test
    public void aHandWithAnAceAndASevenHasValueEighteen(){
        Hand h = new Hand();
        h.add(new Card(7, "S"));
        h.add(new Card(1, "S"));
        assertEquals(18, h.value());
    }

    @Test
    public void aTenAndAnAceIsABlackJack(){
        Hand h = new Hand();
        h.add(new Card(10, "S"));
        h.add(new Card(1, "S"));
        assertTrue(h.isBlackjack());
    }
}
