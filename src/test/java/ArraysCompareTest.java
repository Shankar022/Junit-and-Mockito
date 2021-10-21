import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysCompareTest {

    @Test
    public void testArraySort_randomArray(){
        int[] numbers = {12,3,4,1};
        int[] expected = {1,3,4,12};
        Arrays.sort(numbers);
        assertArrayEquals(expected,numbers);
    }

    //this test expecting a null pointer exception
    @Test(expected = NullPointerException.class)
    public void testArraySort_nullArray(){
        int[] numbers = null;
        int[] expected = {1,3,4,12};
        Arrays.sort(numbers);
        //assertArrayEquals(expected,numbers);
    }

    @Test(timeout = 100)
    public void testSort_Performance(){
        int[] numbers = {1,3,4,12};
        for(int i =0; i<=1000000; i++){
            numbers[0] = i;
            Arrays.sort(numbers);
        }
    }

}