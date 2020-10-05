package leetcode.interview;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void addToArrayForm() {
        assertEquals(new ArrayList<Integer>(){{
            add(1);add(2);add(3);add(4);
        }}
        , new Solution1().addToArrayForm(new int[]{1,2,0,0}, 34));
    }

    @Test
    void addToArrayForm2() {
        assertEquals(new ArrayList<Integer>(){{
                         add(1);add(0);add(0);add(0);
                     }}
                , new Solution1().addToArrayForm(new int[]{9,9,9}, 1));
    }

    @Test
    void addToArrayForm23() {
        assertEquals(new ArrayList<Integer>(){{
                         add(2);add(3);
                     }}
                , new Solution1().addToArrayForm(new int[]{0}, 23));
    }
}