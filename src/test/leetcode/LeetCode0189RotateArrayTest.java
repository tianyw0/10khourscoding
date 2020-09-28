package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LeetCode0189RotateArrayTest {

    LeetCode0189RotateArray rotateArray
            = new LeetCode0189RotateArray();
    @Test
    void rotate() {
        int[] ints = {1, 2, 3, 4};
        rotateArray.rotate(ints, 3);
        assertArrayEquals(new int[]{2,3,4,1}, ints);
    }
}