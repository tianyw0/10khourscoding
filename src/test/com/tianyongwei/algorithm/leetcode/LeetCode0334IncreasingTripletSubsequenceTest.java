package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0334IncreasingTripletSubsequenceTest {

    LeetCode0334IncreasingTripletSubsequence increasingTripletSubsequence
            = new LeetCode0334IncreasingTripletSubsequence();

    @Test
    void increasingTriplet1() {
        assertEquals(true, increasingTripletSubsequence.increasingTriplet(new int[]{1,2,3,4}));
    }
    @Test
    void increasingTriplet2() {
        assertEquals(true, increasingTripletSubsequence.increasingTriplet(new int[]{1,4,3,4}));
    }
    @Test
    void increasingTriplet3() {
        assertEquals(true, increasingTripletSubsequence.increasingTriplet(new int[]{5,1,5,5,2,5,4}));
    }

    @Test
    void increasingTriplet4() {
        assertEquals(true, increasingTripletSubsequence.increasingTriplet(new int[]{1,0,0,0,10,0,0,0,0,100}));
    }
}