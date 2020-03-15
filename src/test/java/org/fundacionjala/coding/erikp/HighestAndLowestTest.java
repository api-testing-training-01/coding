package org.fundacionjala.coding.erikp;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HighestAndLowestTest{

    @Test
    public void HighestLowest() {
        List<Integer> input = Arrays.asList(1, 0, 2, 3, 4, 56, 78, 99, 6, -1, -5, -3, -1000, 1000);
        Integer expectedMax = 1000;
        Integer expectedMin = -1000;

        Integer actualMax = HighestAndLowest.high(input);
        Integer actualMin = HighestAndLowest.low(input);

        assertEquals(expectedMax, actualMax);
        assertEquals(expectedMin, actualMin);
    }
}