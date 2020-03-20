package org.fundacionjala.coding.gilmar;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void reverseString() {
        String input = " prueba de inversion";
        String expectedString = "noisrevni ed abeurp";
        String process = ReverseString.reverse(input);
        Assert.assertEquals(expectedString, process);
    }

    @Test
    public void negativeReverseString() {
        String input = " prueba de inversion";
        String expectedString = "negative noisrevni ed abeurp";
        String process = ReverseString.reverse(input);
        Assert.assertNotEquals(expectedString, process);
    }

    @Test
    public void cleanDuplicatesString() {
        String input = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        String expectedString = "alpha beta gamma delta";
        String process = RemoveDuplicates.cleanUpDuplicates(input);
        Assert.assertEquals(expectedString, process);
    }
}
