package com.tianyongwei.algorithm.leetcode.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    @Test
    void isMonotonic() {
        assertEquals(false, new Solution2().isMonotonic(new int[]{1,2,3,2}));
    }

    @Test
    void isMonotonic2() {
        assertEquals(true, new Solution2().isMonotonic(new int[]{1,2,3}));
    }

    @Test
    void isMonotonic222() {
        assertEquals(true, new Solution2().isMonotonic(new int[]{1,2,2,3}));
    }

    @Test
    void isMonotonic3() {
        assertEquals(true, new Solution2().isMonotonic(new int[]{1}));
    }

    @Test
    void isMonotonic4() {
        assertEquals(false, new Solution2().isMonotonic(new int[]{1,2,3,2,4}));
    }


}