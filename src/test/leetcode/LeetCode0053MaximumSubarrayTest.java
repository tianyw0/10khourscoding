package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0053MaximumSubarrayTest {

    @Test
    void maxSubArray() {
        assertEquals(12, new LeetCode0053MaximumSubarray().maxSubArray(new int[]{1,2,4,5}));
    }

    @Test
    void maxSubArray2() {
        assertEquals(6, new LeetCode0053MaximumSubarray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    void maxSubArray3() {
        assertEquals(100, new LeetCode0053MaximumSubarray().maxSubArray(new int[]{-2,100}));
    }
}