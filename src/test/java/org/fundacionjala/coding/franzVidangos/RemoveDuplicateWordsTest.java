package org.fundacionjala.coding.franzVidangos;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveDuplicateWordsTest {

    @Test
    public void longSentence() {
        String expectedString = "alpha beta gamma delta";
        final String inputString = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        String actualString = RemoveDuplicateWords.removeWords(inputString);
        assertEquals(expectedString, actualString);
    }

    @Test
    public void oneWord() {
        String expectedString = "alpha";
        final String inputString = "alpha";
        String actualString = RemoveDuplicateWords.removeWords(inputString);
        assertEquals(expectedString, actualString);
    }

    @Test
    public void shortSentence() {
        String expectedString = "my cat is fat";
        final String inputString = "my cat is my cat fat";
        String actualString = RemoveDuplicateWords.removeWords(inputString);
        assertEquals(expectedString, actualString);
    }
}
