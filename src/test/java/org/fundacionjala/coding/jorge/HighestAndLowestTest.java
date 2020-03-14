package org.fundacionjala.coding.jorge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighestAndLowestTest {

    @Test
    public void findHighAndLow() {
        String text = "1 2 3 4 5";
        String expectedResult = "5 1";
        assertEquals(expectedResult, HighestAndLowest.findHighestAndLowest(text));
    }

    @Test
    public void findHighAndLowTwo() {
        String text = "1 2 -3 4 5";
        String expectedResult = "5 -3";
        assertEquals(expectedResult, HighestAndLowest.findHighestAndLowest(text));
    }

    @Test
    public void findHighAndLowThree() {
        String text = "1 9 3 4 -5";
        String expectedResult = "9 -5";
        assertEquals(expectedResult, HighestAndLowest.findHighestAndLowest(text));
    }
}