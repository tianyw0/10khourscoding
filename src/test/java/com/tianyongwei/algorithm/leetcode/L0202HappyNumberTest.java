package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0202HappyNumberTest {

    @Test
    void isHappy() {
        assertEquals( true, new L0202HappyNumber().isHappy(100));
    }

    @Test
    void isHappy2() {
        assertEquals( true, new L0202HappyNumber().isHappy(1));
    }

    @Test
    void isHappy3() {
        assertEquals( false, new L0202HappyNumber().isHappy(2));
    }

    @Test
    void isHappy4() {
        assertEquals( true, new L0202HappyNumber().isHappy(19));
    }
}