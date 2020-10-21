package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0038CountandSayTest {

    @Test
    void countAndSay() {
        assertEquals("11", new LeetCode0038CountandSay().countAndSay(2));
    }

    @Test
    void countAndSay2() {
        assertEquals("21", new LeetCode0038CountandSay().countAndSay(3));
    }

    @Test
    void countAndSay3() {
        assertEquals("1211", new LeetCode0038CountandSay().countAndSay(4));
    }

    @Test
    void countAndSay4() {
        assertEquals("111221", new LeetCode0038CountandSay().countAndSay(5));
    }
}