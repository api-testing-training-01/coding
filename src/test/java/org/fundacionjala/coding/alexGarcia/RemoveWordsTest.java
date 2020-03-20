package org.fundacionjala.coding.alexGarcia;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveWordsTest {
    @Test
    public void removeDuplicateWordsTest() {
        assertEquals(RemoveWords.removeDuplicateWords(
                "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"),
                "alpha beta gamma delta");
    }
}
