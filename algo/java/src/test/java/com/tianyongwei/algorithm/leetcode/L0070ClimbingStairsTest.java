package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0070ClimbingStairsTest {

    @Test
    void climbStairs() {
        assertEquals(1, new L0070ClimbingStairs().climbStairs(1));
    }

    @Test
    void climbStairs2() {
        assertEquals(2, new L0070ClimbingStairs().climbStairs(2));
    }

    @Test
    void climbStairs3() {
        assertEquals(3, new L0070ClimbingStairs().climbStairs(3));
    }

    @Test
    void climbStairs4() {
        assertEquals(5, new L0070ClimbingStairs().climbStairs(4));
    }
}