import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    @Test
    public void testTruncateAInFirst2Positions_AInFirst2Positions() {
        StringHelper helper = new StringHelper();
        assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions2_AInFirstPosition() {
        StringHelper helper = new StringHelper();
        assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
    }
}