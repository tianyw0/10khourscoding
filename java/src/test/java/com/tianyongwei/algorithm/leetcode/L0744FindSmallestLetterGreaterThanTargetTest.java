package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0744FindSmallestLetterGreaterThanTargetTest {

    @Test
    void nextGreatestLetter() {
        assertEquals('b', new L0744FindSmallestLetterGreaterThanTarget()
                .nextGreatestLetter(new char[]{'a', 'b', 'c'}, 'a'));
    }
    @Test
    void nextGreatestLetter2() {
        assertEquals('c', new L0744FindSmallestLetterGreaterThanTarget()
                .nextGreatestLetter(new char[]{'c'}, 'a'));
    }

    @Test
    void nextGreatestLetter3() {
        assertEquals('c', new L0744FindSmallestLetterGreaterThanTarget()
                .nextGreatestLetter(new char[]{'c','f','j'}, 'a'));
    }

    @Test
    void nextGreatestLetter4() {
        assertEquals('f', new L0744FindSmallestLetterGreaterThanTarget()
                .nextGreatestLetter(new char[]{'c','f','j'}, 'c'));
    }

    @Test
    void nextGreatestLetter5() {
        assertEquals('c', new L0744FindSmallestLetterGreaterThanTarget()
                .nextGreatestLetter(new char[]{'c','f','j'}, 'k'));
    }
}