package org.fundacionjala.coding.jorge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateWordsTest {

    @Test
    public void removeDuplicates() {
        String text = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        String expectedResult = "alpha beta gamma delta";

        assertEquals(expectedResult, RemoveDuplicateWords.removeDuplicate(text));
    }
}
