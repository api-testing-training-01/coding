package org.fundacionjala.coding.jacky;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HighestAndLowestTest {
    @Test
    public void test1() {
        assertEquals("42 -9", HighestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        assertEquals("0 -4", HighestAndLowest.highAndLow("0 -4"));
        assertEquals("100 0", HighestAndLowest.highAndLow("100 0 0 52"));
        assertEquals("1 1", HighestAndLowest.highAndLow("1"));
        assertEquals("-15 -68", HighestAndLowest.highAndLow("-51 -15 -68"));
    }
}
