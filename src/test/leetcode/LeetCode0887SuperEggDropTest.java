package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0887SuperEggDropTest {

    LeetCode0887SuperEggDrop superEggDrop
            = new LeetCode0887SuperEggDrop();

    @Test
    void superEggDrop() {
        assertEquals(1, superEggDrop.superEggDrop(2, 6));
    }
}