package org.fundacionjala.coding.marcos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void reverseString() {
        String input = "abcd";
        String expectedOut = "dcba";
        String actual = ReverseString.invert(input);
        assertEquals(expectedOut,actual);
    }
}
