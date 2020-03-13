package org.fundacionjala.coding.dgsoto;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void test1ReverseString() {
        String expectedString = "Welcome";
        final String inputString = "emocleW";
        String actualString = ReverseString.invertString(inputString);
        assertEquals(expectedString, actualString);
    }

    @Test
    public void test2ReverseString() {
        String expectedString = "Hey fellow warriors";
        String inputString = "Hey wollef sroirraw";
        String actualString = ReverseString.invertString(inputString);
        assertEquals(expectedString, actualString);
    }

    @Test
    public void test3ReverseString() {
        String expectedString = "pastel";
        String inputString = "letsap";
        String actualString = ReverseString.invertString(inputString);
        assertEquals(expectedString, actualString);
    }

    @Test
    public void test4ReverseString() {
        String expectedString = "cba";
        String inputString = "cba";
        String actualString = ReverseString.invertString(inputString);
        assertEquals(expectedString, actualString);
    }

    @Test
    public void test5ReverseString() {
        String expectedString = "course automation";
        String inputString = "esruoc noitamotua";
        String actualString = ReverseString.invertString(inputString);
        assertEquals(expectedString, actualString);
    }

    @Test
    public void test6ReverseString() {
        assertEquals("_ala_", ReverseString.invertString("_ala_"));
        assertEquals("_omo", ReverseString.invertString("_omo"));
        assertEquals(null, ReverseString.invertString(""));
        assertEquals(null, ReverseString.invertString("     "));
        assertEquals("Hey fellow warriors", ReverseString.invertString("Hey wollef sroirraw"));
        assertEquals("This is a test", ReverseString.invertString("This is a test"));
        assertEquals("This is another test", ReverseString.invertString("This is rehtona test"));
    }
}
