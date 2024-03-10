package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0242ValidAnagramTest {

    @Test
    void isAnagram() {
        assertEquals(false, new L0242ValidAnagram()
                .isAnagram("cat", "car"));
    }

    @Test
    void isAnagram2() {
        assertEquals(true, new L0242ValidAnagram()
                .isAnagram("cat", "tac"));
    }

    @Test
    void isAnagram3() {
        assertEquals(true, new L0242ValidAnagram()
                .isAnagram("", ""));
    }

}