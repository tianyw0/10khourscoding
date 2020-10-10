package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0004MedianofTwoSortedArraysTest {
    @Test
    void findMedianSortedArrays() {
        assertEquals(3D,
                new LeetCode0004MedianofTwoSortedArrays().findMedianSortedArrays(
                        new int[]{1,2,3}, new int[]{4,5}));
    }

    @Test
    void findMedianSortedArrays2() {
        assertEquals(1D,
                new LeetCode0004MedianofTwoSortedArrays().findMedianSortedArrays(
                        new int[]{1}, new int[]{}));
    }

    @Test
    void findMedianSortedArrays3() {
        assertEquals(1.5D,
                new LeetCode0004MedianofTwoSortedArrays().findMedianSortedArrays(
                        new int[]{1,2}, new int[]{}));
    }

    @Test
    void findMedianSortedArrays4() {
        assertEquals(2D,
                new LeetCode0004MedianofTwoSortedArrays().findMedianSortedArrays(
                        new int[]{1,2}, new int[]{3}));
    }

    @Test
    void findMedianSortedArrays5() {
        assertEquals(1D,
                new LeetCode0004MedianofTwoSortedArrays().findMedianSortedArrays(
                        new int[]{1,1}, new int[]{1}));
    }
}