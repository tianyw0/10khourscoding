package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0278FirstBadVersionTest {

    @Test
    void firstBadVersion() {
        assertEquals(8, new LeetCode0278FirstBadVersion().firstBadVersion(10));
    }
}