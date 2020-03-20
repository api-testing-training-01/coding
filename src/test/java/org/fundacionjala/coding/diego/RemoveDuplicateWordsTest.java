package org.fundacionjala.coding.diego;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateWordsTest {

    @Test
    public void testRemoveDuplicateWords() {
        String expectedResult = "alpha beta gamma delta";
        String actualResult = RemoveDuplicateWords.removeDuplicateWords("alpha beta beta gamma gamma delta");
        assertEquals(expectedResult, actualResult);
    }
}
