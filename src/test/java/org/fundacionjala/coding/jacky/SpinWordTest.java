package org.fundacionjala.coding.jacky;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpinWordTest {
    @Test
    public void reverseString() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));

    }
}
