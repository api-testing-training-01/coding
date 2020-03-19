package org.fundacionjala.coding.JoseEguivar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class RemoveDuplicatesWordsTest {
    @Test
    public void basicTests(){
        assertEquals("alpha beta gamma delta", RemoveDuplicatesWords.removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        assertEquals("my cat is fat", RemoveDuplicatesWords.removeDuplicateWords("my cat is my cat fat"));
    }
}
