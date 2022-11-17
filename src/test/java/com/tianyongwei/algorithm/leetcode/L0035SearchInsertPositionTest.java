package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L0035SearchInsertPositionTest {

    L0035SearchInsertPosition searchInsertPosition
            = new L0035SearchInsertPosition();

    @Test
    void searchInsert() {
        assertEquals(2, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0));
        assertEquals(1, searchInsertPosition.searchInsert(new int[]{1, 3}, 2));
        assertEquals(1, searchInsertPosition.searchInsert(new int[]{1,2,3,4,5,10}, 2));
    }
}