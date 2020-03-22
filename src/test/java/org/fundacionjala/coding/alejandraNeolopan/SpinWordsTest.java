package org.fundacionjala.coding.alejandraNeolopan;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpinWordsTest {
    @Test
    public void test() {
        String expected2 = "Hey wollef sroirraw";
        String expected3 = "Just gniddik [ereht is llits] one more";
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals(expected2, new SpinWords().spinWords("Hey fellow warriors"));
        assertEquals(expected3, new SpinWords().spinWords("Just kidding [there is still] one more"));
    }

}
