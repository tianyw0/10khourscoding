package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class L0088MergeSortedArrayTest {

    L0088MergeSortedArray mergeSortedArray
            = new L0088MergeSortedArray();

    int[] nums1 = {1,2,7,0,0,0};

    @Test
    void merge() {
        mergeSortedArray.merge(nums1, 3, new int[]{2,5,6}, 3);
        assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }

    @Test
    void merge2() {
        mergeSortedArray.merge2(nums1, 3, new int[]{2,5,6}, 3);
        assertArrayEquals(new int[]{1,2,2,5,6,7}, nums1);
    }
}