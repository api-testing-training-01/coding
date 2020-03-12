package org.fundacionjala.coding.erikp;

import org.fundacionjala.erikp.SpinWords;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpinWordsTest {

    @Test
    public void reverseString() {
        String input = "this is a testing proposed holasa abc holasa a b c mnbvcxz";
        String expected = "this is a gnitset desoporp asaloh abc asaloh a b c zxcvbnm";
        String actual = SpinWords.invert(input);
        assertEquals(expected.trim(), actual);
    }
}
