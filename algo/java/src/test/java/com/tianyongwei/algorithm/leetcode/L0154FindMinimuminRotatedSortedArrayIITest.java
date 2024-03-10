package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0154FindMinimuminRotatedSortedArrayIITest {

    @Test
    void findMin() {
        assertEquals(1, new L0154FindMinimuminRotatedSortedArrayII()
                .findMin(new int[]{1,3,5}));
    }
    @Test
    void findMin2() {
        assertEquals(0, new L0154FindMinimuminRotatedSortedArrayII()
                .findMin(new int[]{2,2,2,0,1}));
    }

    @Test
    void findMin23() {
        assertEquals(0, new L0154FindMinimuminRotatedSortedArrayII()
                .findMin(new int[]{2,2,2,0,0,0,1}));
    }

    @Test
    void findMin2322() {
        assertEquals(1, new L0154FindMinimuminRotatedSortedArrayII()
                .findMin(new int[]{1,3,3}));
    }

    @Test
    void findMin232222() {
        assertEquals(1, new L0154FindMinimuminRotatedSortedArrayII()
                .findMin(new int[]{3,3,3,3,1,3,3}));
    }

    @Test
    void findMin23222222() {
        assertEquals(1, new L0154FindMinimuminRotatedSortedArrayII()
                .findMin(new int[]{5,5,5,5,5,5,5,5,5,5,1}));
    }


}