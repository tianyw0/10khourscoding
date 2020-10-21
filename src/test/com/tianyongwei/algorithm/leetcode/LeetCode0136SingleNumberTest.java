package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0136SingleNumberTest {

    private LeetCode0136SingleNumber singleNumber
            = new LeetCode0136SingleNumber();

    @Test
    void searchInsert() {
        assertEquals(3, singleNumber.searchInsert(new int[]{2,2,3}));
        assertEquals(4, singleNumber.searchInsert(new int[]{4,1,2,1,2}));
    }
}