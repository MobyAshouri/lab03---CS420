package lab03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class lab03_JUnit {
    // TEST BASED OFF INSTRUCTIONS PDF INPUT AND OUTPUT
    @Test
    public void test_100_200(){
        assertEquals("100 200 125", lab03.simpleAlgorithm(100, 200));
    }
    @Test
    public void test_201_210(){
        assertEquals("201 210 89", lab03.simpleAlgorithm(201, 210));
    }
    @Test
    public void test_900_1000(){
        assertEquals("900 1000 174", lab03.simpleAlgorithm(900, 1000));
    }

    // MY OWN TESTS
    @Test
    public void test_1_10_modified(){
        /* This works perfectly fine. */
        assertEquals("1 10 9", lab03.simpleAlgorithm(1, 10));
    }
    @Test
    public void test_22_22(){
        assertEquals("22 22 16", lab03.simpleAlgorithm(22, 22));
    }
    @Test
    public void test_10_0(){
        assertEquals("10 0 0", lab03.simpleAlgorithm(10, 0));
    }
    @Test
    public void test_10_n10(){
        assertEquals("10 -10 0", lab03.simpleAlgorithm(10, -10));
    }
}
