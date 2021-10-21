import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    //assertE(message, expected, actual)
    //AACD => CD
    StringHelper helper = new StringHelper();

    @Test
    public void shouldTruncateAInFirst2Positions(){
       assertEquals("'A' should be in first two positions.","CD",helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void shouldTruncateAInFirstPositions(){
        assertEquals("'A' should be in first position1.","CD",helper.truncateAInFirst2Positions("ACD"));
    }

    // ABCD => false, ABAB => true, AB => true, A => false
    @Test
    public void shouldFirstAndLastTwoCharactersTheSame_NegativeScenario(){
        assertFalse("First and last character should be same.",helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void shouldFirstAndLastTwoCharactersTheSame_PositiveScenario(){
        assertTrue("First and last character should be same.",helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
}
