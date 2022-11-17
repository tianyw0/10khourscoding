package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L0136SingleNumberTest {

    private L0136SingleNumber singleNumber
            = new L0136SingleNumber();

    @Test
    void searchInsert() {
        assertEquals(3, singleNumber.searchInsert(new int[]{2,2,3}));
        assertEquals(4, singleNumber.searchInsert(new int[]{4,1,2,1,2}));
    }
}