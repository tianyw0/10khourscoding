package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0887SuperEggDrop1Test {

    LeetCode0887SuperEggDrop1 superEggDrop
            = new LeetCode0887SuperEggDrop1();

    @Test
    void testSuperEggDrop() {
        assertEquals(3, superEggDrop.superEggDrop(2, 6));
        assertEquals(4, superEggDrop.superEggDrop(3, 14));
        assertEquals(1, superEggDrop.superEggDrop(2, 1));
        assertEquals(19, superEggDrop.superEggDrop(4, 5000));
        assertEquals(14, superEggDrop.superEggDrop(8, 10000));
    }
}