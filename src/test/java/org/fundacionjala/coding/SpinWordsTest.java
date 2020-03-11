package org.fundacionjala.coding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpinWordsTest {

    @Test
    public void spinWords() {
        String text = "Hey fellow warriors";
        String expectedResult = "Hey wollef sroirraw";
        String actualText = SpinWords.convertToSpin(text);
        assertEquals(expectedResult, actualText);
    }
}
