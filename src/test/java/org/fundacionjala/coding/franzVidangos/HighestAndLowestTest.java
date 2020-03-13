package org.fundacionjala.coding.franzVidangos;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HighestAndLowestTest {

    @Test
    public void inSecuence() {
        String expectedOut = "5 1";
        String actual = HighestAndLowest.highAndLow("1 2 3 4 5");
        assertEquals(expectedOut, actual);
    }

    @Test
    public void negativeNumber() {
        String expectedOut = "9 -5";
        String actual = HighestAndLowest.highAndLow("1 9 3 4 -5");
        assertEquals(expectedOut, actual);
    }

    @Test
    public void longList() {
        String expectedOut = "42 -9";
        String actual = HighestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
        assertEquals(expectedOut, actual);
    }

    @Test
    public void singleTest() {
        String expectedOut = "8 8";
        String actual = HighestAndLowest.highAndLow("8");
        assertEquals(expectedOut, actual);
    }

    @Test
    public void plusPlusZeroTest() {
        String expectedOut = "1 0";
        String actual = HighestAndLowest.highAndLow("1 1 0");
        assertEquals(expectedOut, actual);
    }

    @Test
    public void minusMinusZeroTest() {
        String expectedOut = "0 -1";
        String actual = HighestAndLowest.highAndLow("-1 -1 0");
        assertEquals(expectedOut, actual);
    }
}
