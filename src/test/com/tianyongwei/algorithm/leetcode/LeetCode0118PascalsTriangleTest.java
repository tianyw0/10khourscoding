package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0118PascalsTriangleTest {

    @Test
    void generate0() {
        assertEquals(new ArrayList<ArrayList>(){{
            add(new ArrayList(){{}});
        }}, new LeetCode0118PascalsTriangle().generate(0));
    }

    @Test
    void generate() {
        assertEquals(new ArrayList<ArrayList>(){{
            add(new ArrayList(){{add(1);}});
        }}, new LeetCode0118PascalsTriangle().generate(1));
    }

    @Test
    void generate2() {
        assertEquals(new ArrayList<ArrayList>(){{
            add(new ArrayList(){{add(1);}});
            add(new ArrayList(){{add(1);add(1);}});
        }}, new LeetCode0118PascalsTriangle().generate(2));
    }

    @Test
    void generate3() {
        assertEquals(new ArrayList<ArrayList>(){{
            add(new ArrayList(){{add(1);}});
            add(new ArrayList(){{add(1);add(1);}});
            add(new ArrayList(){{add(1);add(2);add(1);}});
        }}, new LeetCode0118PascalsTriangle().generate(3));
    }

    @Test
    void generate4() {
        assertEquals(new ArrayList<ArrayList>(){{
            add(new ArrayList(){{add(1);}});
            add(new ArrayList(){{add(1);add(1);}});
            add(new ArrayList(){{add(1);add(2);add(1);}});
            add(new ArrayList(){{add(1);add(3);add(3);add(1);}});
        }}, new LeetCode0118PascalsTriangle().generate(4));
    }
}