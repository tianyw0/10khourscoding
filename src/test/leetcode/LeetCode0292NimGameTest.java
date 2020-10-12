package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0292NimGameTest {

    @Test
    void canWinNim() {
        assertEquals(false, new LeetCode0292NimGame().canWinNim(4));
    }

    @Test
    void canWinNim2() {
        assertEquals(true, new LeetCode0292NimGame().canWinNim(5));
    }


}