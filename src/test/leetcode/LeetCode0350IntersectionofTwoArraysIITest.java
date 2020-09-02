package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0350IntersectionofTwoArraysIITest {

    LeetCode0350IntersectionofTwoArraysII intersectionofTwoArraysII
            = new LeetCode0350IntersectionofTwoArraysII();

    @Test
    void intersect() {
        assertArrayEquals(new int[]{1,2,3}, intersectionofTwoArraysII.intersect(new int[]{1,2,3}, new int[]{1,2,3,4}));
    }

    @Test
    void intersect1() {
        assertArrayEquals(new int[]{2,2}, intersectionofTwoArraysII.intersect(new int[]{1,2,2,1}, new int[]{2,2}));
    }

    @Test
    void intersect2() {
        assertArrayEquals(new int[]{2}, intersectionofTwoArraysII.intersect(new int[]{1,2,2,1}, new int[]{2}));
    }
}