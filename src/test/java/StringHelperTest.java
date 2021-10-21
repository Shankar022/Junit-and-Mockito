import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    @Test
    public void testTruncateAInFirst2Positions() {
        StringHelper helper = new StringHelper();
        assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
    }
}