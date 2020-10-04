package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0153FindMinimuminRotatedSortedArrayTest {

    @Test
    void findMin() {
        assertEquals(1, new LeetCode0153FindMinimuminRotatedSortedArray().findMin(new int[]{1,2,3,4,5,6}));
    }

    @Test
    void findMin2() {
        assertEquals(1, new LeetCode0153FindMinimuminRotatedSortedArray().findMin(new int[]{7,8,1,2,3,4,5,6}));
    }

    @Test
    void findMin3() {
        assertEquals(1, new LeetCode0153FindMinimuminRotatedSortedArray().findMin(new int[]{1}));
    }
}