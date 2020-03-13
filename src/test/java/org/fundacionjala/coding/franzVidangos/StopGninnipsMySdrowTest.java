package org.fundacionjala.coding.franzVidangos;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StopGninnipsMySdrowTest {

    @Test
    public void spinAllWords() {
        String expectedOut = "olleH dlrow";
        String actual = SpinWords.sentenceBuilder("Hello world");
        System.out.println(actual);
        assertEquals(expectedOut, actual);
    }
    @Test
    public void onlyOneWord() {
        String expectedOut = "Hi dlrow";
        String actual = SpinWords.sentenceBuilder("Hi world");
        System.out.println(actual);
        assertEquals(expectedOut, actual);
    }

    @Test
    public void anyWord() {
        String expectedOut = "This is a test";
        String actual = SpinWords.sentenceBuilder("This is a test");
        System.out.println(actual);
        assertEquals(expectedOut, actual);
    }
}

