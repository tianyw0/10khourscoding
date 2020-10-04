package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0658FindKClosestElementsTest {

    @Test
    void findClosestElements() {
        assertEquals(new ArrayList<Integer>(){{add(1);}}, new LeetCode0658FindKClosestElements().findClosestElements(new int[]{1,2,3,4,5}, 1, 1));
    }

    @Test
    void findClosestElements1() {
        assertEquals(new ArrayList<Integer>(){{add(2);add(3);}}, new LeetCode0658FindKClosestElements().findClosestElements(new int[]{1,2,3,4,5}, 2, 3));
    }

    @Test
    void findClosestElements2() {
        assertEquals(new ArrayList<Integer>(){{add(2);}}, new LeetCode0658FindKClosestElements().findClosestElements(new int[]{1,2,3,4,5}, 1, 2));
    }

    @Test
    void findClosestElements3() {
        assertEquals(new ArrayList<Integer>(){{add(2);add(3);add(4);}}, new LeetCode0658FindKClosestElements().findClosestElements(new int[]{1,2,3,4,5}, 3, 3));
    }
}