import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    //assertE(message, expected, actual)
    //AACD => CD

    StringHelper helper;
    String input;
    String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Before
    public void setUp() {
        helper = new StringHelper();
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions(){
        String [][] expectedOutputs = {{"AACD","CD"},{"ACD","CD"}};
        // {"AACD","CD"} this data passed to the constructor arguments

        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void shouldTruncateAInFirst2Positions() {
        assertEquals("'A' should be in first two positions.", expectedOutput, helper.truncateAInFirst2Positions(input));
    }

    @Test
    public void shouldTruncateAInFirstPositions() {
        assertEquals("'A' should be in first position1.", expectedOutput, helper.truncateAInFirst2Positions(input));
    }

}
