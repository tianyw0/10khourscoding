package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L0169MajorityElementTest {

    L0169MajorityElement majorityElement
            = new L0169MajorityElement();

    @Test
    void majorityElement() {
        assertEquals(2, majorityElement.solution(new int[]{2,2,3}));
        assertEquals(2, majorityElement.solution(new int[]{2,2,1,1,1,2,2}));
    }
}