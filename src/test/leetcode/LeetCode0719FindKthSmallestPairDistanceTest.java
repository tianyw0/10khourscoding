package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0719FindKthSmallestPairDistanceTest {

    @Test
    void smallestDistancePair() {
        assertEquals(1
                , new LeetCode0719FindKthSmallestPairDistance().smallestDistancePair(new int[]{1,2,3}, 1));
    }

    @Test
    void smallestDistancePair1() {
        assertEquals(2
                , new LeetCode0719FindKthSmallestPairDistance().smallestDistancePair(new int[]{1,2,4}, 2));
    }
}