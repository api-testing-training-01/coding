package org.fundacionjala.coding.alexGarcia;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpinWordsTest {
    @Test
    public void reverseString() {
        assertEquals(SpinWords.invert("Welcome"),
                "emocleW");
        assertEquals(SpinWords.invert("Hey fellow warriors"),
                "Hey wollef sroirraw");
        assertEquals(SpinWords.invert("This is a test"),
                "This is a test");
        assertEquals(SpinWords.invert("This is another test"),
                "This is rehtona test");
        assertEquals(SpinWords.invert("You are almost to the last test"),
                "You are tsomla to the last test");
        assertEquals(SpinWords.invert("Just kidding there is still one more"),
                "Just gniddik ereht is llits one more");
        assertEquals(SpinWords.invert("Seriously this is the last one"),
                "ylsuoireS this is the last one");
    }
}
