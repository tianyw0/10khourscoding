package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0887SuperEggDropTest {

    LeetCode0887SuperEggDrop superEggDrop
            = new LeetCode0887SuperEggDrop();

    @Test
    void superEggDrop() {
//        assertEquals(3, superEggDrop.superEggDrop(2, 6));
//        assertEquals(4, superEggDrop.superEggDrop(3, 14));
//        assertEquals(1, superEggDrop.superEggDrop(2, 1));
//        assertEquals(19, superEggDrop.superEggDrop(4, 5000));
    }

    @Test
    void testSuperEggDrop_p() {
//        assertEquals(3, superEggDrop.superEggDrop_p(2, 6));
//        assertEquals(4, superEggDrop.superEggDrop_p(3, 14));
//        assertEquals(1, superEggDrop.superEggDrop_p(2, 1));
        assertEquals(19, superEggDrop.superEggDrop_p(4, 5000));
    }
}