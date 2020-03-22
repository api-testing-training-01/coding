package org.fundacionjala.coding.alejandraNeolopan;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RemoveDuplicateTest {
    @Test
    public void basicTests() {
        String sample1 = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        String sample2 = "my cat is my cat fat";
        assertEquals("alpha beta gamma delta", new RemoveDuplicateWords().removeDuplicateWords(sample1));
        assertEquals("my cat is fat", new RemoveDuplicateWords().removeDuplicateWords(sample2));
    }
}
