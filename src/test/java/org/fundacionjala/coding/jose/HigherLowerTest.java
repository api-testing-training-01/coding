package org.fundacionjala.coding.jose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HigherLowerTest {
    @Test
    public void test1HihgerLOwer() {
        assertEquals("9 -5", HigherLower.demoHigherLower("9 6 -5 5 1 -2 2"));
    }
}


