package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0155MinStackTest {

    @Test
    void test() {
        //["MinStack","push","push","push","getMin","top","pop","getMin"]
        //[[],[-2],[0],[-1],[],[],[],[]]
        L0155MinStack minStack = new L0155MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);
        assertEquals(-2, minStack.getMin());
        assertEquals(-1, minStack.top());
        minStack.pop();
        assertEquals(-2, minStack.getMin());
    }
}