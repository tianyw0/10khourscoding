package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0557ReverseWordsinaStringIIITest {

    @Test
    void reverseWords() {
        assertEquals("I EVOL U", new L0557ReverseWordsinaStringIII().reverseWords("I LOVE U"));
    }

    @Test
    void reverseWords2() {
        assertEquals("U", new L0557ReverseWordsinaStringIII().reverseWords("U"));
    }
}