package org.fundacionjala.coding.alexGarcia;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighestAndLowestTest {
    @Test
    public void highAndLowNumber() {
        assertEquals(HighestAndLowest.highAndLow(
                "4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), "542 -214");
    }
}
