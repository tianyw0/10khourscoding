package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0349IntersectionofTwoArraysTest {

    @Test
    void intersection() {
        assertArrayEquals(new int[]{1}, new LeetCode0349IntersectionofTwoArrays()
                .intersection(new int[]{1,3}, new int[]{1,2}));
    }

    @Test
    void intersection2() {
        assertArrayEquals(new int[]{}, new LeetCode0349IntersectionofTwoArrays()
                .intersection(new int[]{4,3}, new int[]{1,2}));
    }
}