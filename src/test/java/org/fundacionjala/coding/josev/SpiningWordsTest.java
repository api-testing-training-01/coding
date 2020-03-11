package org.fundacionjala.coding.josev;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpiningWordsTest {

    @Test
    public void test2SpiningWords() {
        assertEquals("Fireworks", SpiningWords.spiningWordsInString("skroweriF"));
        assertEquals(null, SpiningWords.spiningWordsInString(" "));
        assertEquals("The worlds", SpiningWords.spiningWordsInString("The sdlrow"));
    }
}
