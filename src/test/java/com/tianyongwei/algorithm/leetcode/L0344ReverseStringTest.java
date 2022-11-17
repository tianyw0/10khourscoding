package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class L0344ReverseStringTest {

    L0344ReverseString reverseString
            = new L0344ReverseString();

    @Test
    void reverseString() {
        char[] chars = {'a', 'b', 'c'};
        reverseString.reverseString(chars);
        assertArrayEquals(new char[]{'c','b','a'}, chars);
    }
}