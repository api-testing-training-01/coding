package org.fundacionjala.coding.diego;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighestAndLowestTest {

    @Test
    public void test1highAndLow() {
        String expectedHighAndLowNumber = "-1 -1";
        String inputHighAndLowNumber = "-1 -1";
        String actualHighAndLowNumber = HighestAndLowest.highAndLow(inputHighAndLowNumber);
        assertEquals(expectedHighAndLowNumber, actualHighAndLowNumber);
    }

    @Test
    public void test2highAndLow() {
        assertEquals("5 1", HighestAndLowest.highAndLow("1 2 3 4 5"));
        assertEquals("5 -3", HighestAndLowest.highAndLow("1 2 -3 4 5"));
        assertEquals("9 -5", HighestAndLowest.highAndLow("1 9 3 4 -5"));
        assertEquals("42 -9", HighestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
