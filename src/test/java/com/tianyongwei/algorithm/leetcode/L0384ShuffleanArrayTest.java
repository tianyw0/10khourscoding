package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class L0384ShuffleanArrayTest {

    L0384ShuffleanArray shuffleanArray
            = new L0384ShuffleanArray(new int[]{1,2,3});

    @Test
    void reset() {
        assertArrayEquals(new int[]{1,2,3}, shuffleanArray.reset());
    }

    @Test
    void shuffle() {
        assertArrayEquals(new int[]{1,2,3}, shuffleanArray.shuffle());
    }
}