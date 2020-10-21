package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class LeetCode0131PalindromePartitioningTest {

    LeetCode0131PalindromePartitioning palindromePartitioning
            = new LeetCode0131PalindromePartitioning();

    @Test
    void partition() {
        ArrayList<ArrayList<String>> lists = new ArrayList<ArrayList<String>>() {{
            add(new ArrayList<String>() {{
                add("a");
                add("a");
                add("b");
            }});
            add(new ArrayList<String>() {{
                add("aa");
                add("b");
            }});
        }};
        assertIterableEquals(lists, palindromePartitioning.partition("aabdd"));
    }

    @Test
    void judge() {
        assertEquals(true, palindromePartitioning.judge("abba"));
    }
}