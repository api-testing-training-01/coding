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
        String inputString = "yeH wollef sroirraw";
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
        String expectedString = "abc";
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
}
