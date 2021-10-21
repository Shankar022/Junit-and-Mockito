import org.junit.*;

import static org.junit.Assert.*;

public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }
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

    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }
}