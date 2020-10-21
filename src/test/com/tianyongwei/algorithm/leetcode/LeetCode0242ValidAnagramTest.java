package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0242ValidAnagramTest {

    @Test
    void isAnagram() {
        assertEquals(false, new LeetCode0242ValidAnagram()
                .isAnagram("cat", "car"));
    }

    @Test
    void isAnagram2() {
        assertEquals(true, new LeetCode0242ValidAnagram()
                .isAnagram("cat", "tac"));
    }

    @Test
    void isAnagram3() {
        assertEquals(true, new LeetCode0242ValidAnagram()
                .isAnagram("", ""));
    }

}