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
    //[0,1,1,1,2,3,6,7,8,9]
    // 9
    // 4
    @Test
    void findClosestElements4() {
        assertEquals(new ArrayList<Integer>() {{
            add(0);
            add(1);
            add(1);
            add(1);
            add(2);
            add(3);
            add(6);
            add(7);
            add(8);
        }}, new LeetCode0658FindKClosestElements().findClosestElements(new int[]{0, 1, 1, 1, 2, 3, 6, 7, 8, 9}, 9, 4));
    }
    //[0,1,2,2,2,3,6,8,8,9]
    // 5
    // 9
    @Test
    void findClosestElements5() {
        assertEquals(new ArrayList<Integer>(){{
            add(3);
            add(6);
            add(8);
            add(8);
            add(9);
        }}, new LeetCode0658FindKClosestElements().findClosestElements(new int[]{0,1,2,2,2,3,6,8,8,9}, 5, 9));
    }

    @Test
    void findClosestElements6() {
        assertEquals(new ArrayList<Integer>(){{
            add(1);
        }}, new LeetCode0658FindKClosestElements().findClosestElements(new int[]{1,3}, 1, 2));
    }
}