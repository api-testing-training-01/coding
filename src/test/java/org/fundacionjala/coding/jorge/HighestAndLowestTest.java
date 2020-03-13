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
}
