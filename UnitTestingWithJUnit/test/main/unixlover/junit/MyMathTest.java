package main.unixlover.junit;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {

    @Test
    public void test() {

        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{1, 2, 3});

        // Check the result is 6
        assertEquals(6, result);
    }
}