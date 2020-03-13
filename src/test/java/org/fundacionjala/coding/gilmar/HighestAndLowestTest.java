package org.fundacionjala.coding.gilmar;

import org.junit.Assert;
import org.junit.Test;

public class HighestAndLowestTest {

    @Test
    public void inputIsNotEmptyString() {
        String input = " 12";
        boolean process = HighestAndLowest.inputIsEmpty(input);
        Assert.assertTrue(process);
    }

    @Test
    public void notOnlySpaceValuesInString() {
        String input = "  5   ";
        boolean process = HighestAndLowest.stringHasOnlySpaces(input);
        Assert.assertFalse(process);
    }

    @Test
    public void highestAndLowest() {
        String input = "512 12 -15 6 9";
        String expectedString = "512 -15";
        String process = HighestAndLowest.resultHighestAndLowest(input);
        Assert.assertEquals(expectedString, process);
    }

    @Test
    public void resultHasTwoValues() {
        String input = "56 6 -15 6 99";
        int expectedCount = 2;
        int process = HighestAndLowest.countResult(HighestAndLowest.resultHighestAndLowest(input));
        Assert.assertEquals(expectedCount, process);
    }

    @Test
    public void resultHasSpaceBetweenValues() {
        String input = "1 2 3 ";
        boolean hasSpace = HighestAndLowest.resultHasSpace(HighestAndLowest.resultHighestAndLowest(input));
        Assert.assertTrue(hasSpace);
    }

    @Test
    public void firstResultValueIsHighestOne() {
        String input = "1 1 1 ";
        boolean firstIsHighest = HighestAndLowest.firstResultIsHighest(HighestAndLowest.resultHighestAndLowest(input));
        Assert.assertTrue(firstIsHighest);
    }
}
