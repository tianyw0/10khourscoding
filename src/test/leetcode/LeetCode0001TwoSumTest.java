package leetcode;

import leetcode.LeetCode0001TwoSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode0001TwoSumTest {

    @Test
    void solution() {
        int[] sums = { -3, 4, 3, 90 };
        int[] result = new LeetCode0001TwoSum().solution1(sums, 93);
        assertArrayEquals(new int[]{2, 3}, result);
    }

    @Test
    void solution2() {
        int[] sums = { -3, 4, 3, 90 };
        int[] result = new LeetCode0001TwoSum().solution1(sums, 94);
        assertArrayEquals(new int[]{1, 3}, result);
    }
}