package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0204CountPrimesTest {

    @Test
    void countPrimes() {
        assertEquals(0, new LeetCode0204CountPrimes().countPrimes(2));
    }

    @Test
    void countPrimes2() {
        assertEquals(1, new LeetCode0204CountPrimes().countPrimes(3));
    }

    @Test
    void countPrimes3() {
        assertEquals(0, new LeetCode0204CountPrimes().countPrimes(1));
    }

    @Test
    void countPrimes4() {
        assertEquals(0, new LeetCode0204CountPrimes().countPrimes(0));
    }

    @Test
    void countPrimes5() {
        assertEquals(4, new LeetCode0204CountPrimes().countPrimes(10));
    }
}