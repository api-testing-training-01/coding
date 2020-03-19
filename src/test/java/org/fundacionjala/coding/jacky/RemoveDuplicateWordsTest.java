package org.fundacionjala.coding.jacky;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateWordsTest {
    @Test
    public void basicTests() {
        assertEquals("alpha beta gamma delta", RemoveDuplicateWords.removeWords(
                "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        assertEquals("my cat is fat", RemoveDuplicateWords.removeWords("my cat is my cat fat"));
        assertEquals("word", RemoveDuplicateWords.removeWords("word"));
        assertEquals("", RemoveDuplicateWords.removeWords("  "));
    }
}
