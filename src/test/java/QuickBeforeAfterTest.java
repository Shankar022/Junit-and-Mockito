import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickBeforeAfterTest {
    @Before
    public void setUp(){
        System.out.println("Before");
    }

    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }

    @After
    public void teardown(){
        System.out.println("After");
    }
}