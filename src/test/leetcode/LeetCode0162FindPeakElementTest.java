package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0162FindPeakElementTest {

    @Test
    void findPeakElement() {
        assertEquals(2, new LeetCode0162FindPeakElement().findPeakElement(new int[]{1,2,3,1}));
    }

    @Test
    void findPeakElement2() {
        assertEquals(5, new LeetCode0162FindPeakElement().findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }

    @Test
    void findPeakElement3() {
        assertEquals(3, new LeetCode0162FindPeakElement().findPeakElement(new int[]{1,2,1,2,1}));
    }
}