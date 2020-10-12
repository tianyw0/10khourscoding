package leetcode.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode0198HouseRobberTest {

    @Test
    void rob() {
        assertEquals(1, new Leetcode0198HouseRobber().rob(new int[]{1,0,0}));
    }

    @Test
    void rob2() {
        assertEquals(4, new Leetcode0198HouseRobber().rob(new int[]{1,2,3}));
    }

    @Test
    void rob3() {
        assertEquals(1, new Leetcode0198HouseRobber().rob(new int[]{1}));
    }

    @Test
    void rob4() {
        assertEquals(3, new Leetcode0198HouseRobber().rob(new int[]{1,3,1}));
    }

    @Test
    void rob5() {
        assertEquals(4, new Leetcode0198HouseRobber().rob(new int[]{1,2,3,1}));
    }

    @Test
    void rob6() {
        assertEquals(102, new Leetcode0198HouseRobber().rob(new int[]{1,2,3,100}));
    }
}