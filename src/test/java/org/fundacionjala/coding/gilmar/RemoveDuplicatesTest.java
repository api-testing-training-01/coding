package org.fundacionjala.coding.gilmar;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {

    @Test
    public void cleanDuplicatesString() {
        String input = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        String expectedString = "alpha beta gamma delta";
        String process = RemoveDuplicates.cleanUpDuplicates(input);
        Assert.assertEquals(expectedString, process);
    }


    @Test
    public void cleanDuplicatesStringWithoutDuplicates() {
        String input = "alpha beta gamma delta";
        String expectedString = "alpha beta gamma delta";
        String process = RemoveDuplicates.cleanUpDuplicates(input);
        Assert.assertEquals(expectedString, process);
    }

    @Test
    public void cleanDuplicatesStringWithOneValue() {
        String input = "delta";
        String expectedString = "delta";
        String process = RemoveDuplicates.cleanUpDuplicates(input);
        Assert.assertEquals(expectedString, process);
    }
}
