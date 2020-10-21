package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0028ImplementstrStrTest {

    @Test
    void strStr() {
        assertEquals(0, new LeetCode0028ImplementstrStr().strStr("ABC", "AB"));
    }

    @Test
    void strStr1() {
        assertEquals(-1, new LeetCode0028ImplementstrStr().strStr("ABC", "CAB"));
    }

    @Test
    void strStr2() {
        assertEquals(2, new LeetCode0028ImplementstrStr().strStr("ABCAB", "CAB"));
    }

    @Test
    void strStr3() {
        assertEquals(-1, new LeetCode0028ImplementstrStr().strStr("", "a"));
    }

    @Test
    void strStr4() {
        assertEquals(0, new LeetCode0028ImplementstrStr().strStr("", ""));
    }
}