package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LeetCode0384ShuffleanArrayTest {

    LeetCode0384ShuffleanArray shuffleanArray
            = new LeetCode0384ShuffleanArray(new int[]{1,2,3});

    @Test
    void reset() {
        assertArrayEquals(new int[]{1,2,3}, shuffleanArray.reset());
    }

    @Test
    void shuffle() {
        assertArrayEquals(new int[]{1,2,3}, shuffleanArray.shuffle());
    }
}