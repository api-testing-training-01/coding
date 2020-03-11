package org.fundacionjala.coding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpinWordsTest {

    @Test
    public void spinWordsOne() {
        String text = "Hey fellow warriors";
        String expectedResult = "Hey wollef sroirraw";
        String actualText = SpinWords.convertToSpin(text);
        assertEquals(expectedResult, actualText);
    }

    @Test
    public void spinWordsTwo() {
        String text = "This is a test";
        String expectedResult = "This is a test";
        String actualText = SpinWords.convertToSpin(text);
        assertEquals(expectedResult, actualText);
    }

    @Test
    public void spinWordsThree() {
        String text = "This is another test";
        String expectedResult = "This is rehtona test";
        String actualText = SpinWords.convertToSpin(text);
        assertEquals(expectedResult, actualText);
    }
}
