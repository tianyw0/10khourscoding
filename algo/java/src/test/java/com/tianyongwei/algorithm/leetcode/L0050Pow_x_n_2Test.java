package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0050Pow_x_n_2Test {
    @Test
    void myPow() {
        assertEquals(8, new L0050Pow_x_n_2().myPow(2, 3));
    }

    @Test
    void myPow2() {
        assertEquals(-8, new L0050Pow_x_n_2().myPow(-2, 3));
    }

    @Test
    void myPow3() {
        assertEquals(1d/8, new L0050Pow_x_n_2().myPow(2, -3));
    }

    @Test
    void myPow4() {
        assertEquals(125d, new L0050Pow_x_n_2().myPow(0.2, -3));
    }

    @Test
    void myPow5() {
        assertEquals(1024.0, new L0050Pow_x_n_2().myPow(2, 10));
    }

    @Test
    void myPow6() {
        assertEquals(0.0, new L0050Pow_x_n_2().myPow(2, -2147483648));
    }
}