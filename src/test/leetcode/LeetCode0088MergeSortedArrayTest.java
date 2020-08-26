package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0088MergeSortedArrayTest {

    LeetCode0088MergeSortedArray mergeSortedArray
            = new LeetCode0088MergeSortedArray();

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