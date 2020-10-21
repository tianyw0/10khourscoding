package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0167TwoSumIIInputarrayissortedTest {

    @Test
    void twoSum() {
        assertArrayEquals(new int[]{1,2}, new LeetCode0167TwoSumIIInputarrayissorted()
                .twoSum(new int[]{1,2,3,4,5}, 3));
    }

    @Test
    void twoSum3() {
        assertArrayEquals(new int[]{4,5}, new LeetCode0167TwoSumIIInputarrayissorted()
                .twoSum(new int[]{1,2,3,4,5}, 9));
    }
}