package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L0387FirstUniqueCharacterinaStringTest {

    L0387FirstUniqueCharacterinaString firstUniqueCharacterinaString
            = new L0387FirstUniqueCharacterinaString();

    @Test
    void firstUniqChar() {
        assertEquals(0, firstUniqueCharacterinaString.firstUniqChar("com/tianyongwei/algorithm/leetcode"));
    }

    @Test
    void firstUniqChar2() {
        assertEquals(2, firstUniqueCharacterinaString.firstUniqChar("loveleetcode"));
    }
}