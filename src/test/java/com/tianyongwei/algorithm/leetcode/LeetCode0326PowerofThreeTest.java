package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0326PowerofThreeTest {

    @Test
    void isPowerOfThree() {
        assertEquals(true, new LeetCode0326PowerofThree().isPowerOfThree(1));
    }

    @Test
    void isPowerOfThree2() {
        assertEquals(false, new LeetCode0326PowerofThree().isPowerOfThree(0));
    }

    @Test
    void isPowerOfThree3() {
        assertEquals(false, new LeetCode0326PowerofThree().isPowerOfThree(2));
    }

    @Test
    void isPowerOfThree4() {
        assertEquals(true, new LeetCode0326PowerofThree().isPowerOfThree(3));
    }

    @Test
    void isPowerOfThree5() {
        assertEquals(false, new LeetCode0326PowerofThree().isPowerOfThree(45));
    }

    @Test
    void isPowerOfThree6() {
        assertEquals(false, new LeetCode0326PowerofThree().isPowerOfThree(-3));
    }
}