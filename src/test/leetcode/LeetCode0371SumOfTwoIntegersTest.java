package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0371SumOfTwoIntegersTest {

    @Test
    void getSum() {
        assertEquals(3, new LeetCode0371SumOfTwoIntegers().getSum(1,2));
    }

    @Test
    void getSum2() {
        assertEquals(2, new LeetCode0371SumOfTwoIntegers().getSum(1,1));
    }

    @Test
    void getSum3() {
        assertEquals(4, new LeetCode0371SumOfTwoIntegers().getSum(2,2));
    }
}