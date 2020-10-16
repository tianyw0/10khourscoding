package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0014LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        assertEquals("ABC", new LeetCode0014LongestCommonPrefix()
                .longestCommonPrefix(new String[] {"ABC", "ABCD", "ABCDE", "ABCDEF"}));
    }

    @Test
    void longestCommonPrefix1() {
        assertEquals("ABC", new LeetCode0014LongestCommonPrefix()
                .longestCommonPrefix(new String[] {"ABC"}));
    }

    @Test
    void longestCommonPrefix2() {
        assertEquals("", new LeetCode0014LongestCommonPrefix()
                .longestCommonPrefix(new String[] {"", "ABCD", "ABCDE", "ABCDEF"}));
    }

    @Test
    void longestCommonPrefix3() {
        assertEquals("", new LeetCode0014LongestCommonPrefix()
                .longestCommonPrefix(new String[] {"CDEF", "ABCD", "ABCDE", "ABCDEF"}));
    }

    @Test
    void longestCommonPrefix4() {
        assertEquals("", new LeetCode0014LongestCommonPrefix()
                .longestCommonPrefix(new String[] {"EFGH", "ABCD", "ABCDE", "ABCDEF"}));
    }
}