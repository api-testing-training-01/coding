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
    public void NegativeReverseString() {
        String input = " prueba de inversion";
        String expectedString = "negative noisrevni ed abeurp";
        String process = ReverseString.reverse(input);
        Assert.assertNotEquals(expectedString, process);
    }
}