package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0739DailyTemperaturesTest {
    @Test
    void dailyTemperatures() {
        assertEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, new LeetCode0739DailyTemperatures()
                .dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }
}