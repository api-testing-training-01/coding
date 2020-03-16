package org.fundacionjala.coding.alejandraNeolopan;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class HighAndLowTest {
    @Test
    public void verifyHighAndLow() {
        assertEquals("42 -9", new HighAndLow().highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
