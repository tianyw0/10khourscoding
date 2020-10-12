package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0066PlusOneTest {

    @Test
    void plusOne() {
        assertArrayEquals(new int[]{1,2,3}, new LeetCode0066PlusOne().plusOne(new int[]{1,2,2}));
    }

    @Test
    void plusOne2() {
        assertArrayEquals(new int[]{1,0,0,0}, new LeetCode0066PlusOne().plusOne(new int[]{9,9,9}));
    }

    @Test
    void plusOne3() {
        assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1,1}, new LeetCode0066PlusOne().plusOne(new int[]{9,8,7,6,5,4,3,2,1,0}));
    }


}