package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0371SumOfTwoIntegersTest {

    @Test
    void getSum() {
        assertEquals(3, new L0371SumOfTwoIntegers().getSum(1,2));
    }

    @Test
    void getSum2() {
        assertEquals(2, new L0371SumOfTwoIntegers().getSum(1,1));
    }

    @Test
    void getSum3() {
        assertEquals(4, new L0371SumOfTwoIntegers().getSum(2,2));
    }

    @Test
    void getSum4() {
        assertEquals(1, new L0371SumOfTwoIntegers().getSum(-2,3));
    }
}