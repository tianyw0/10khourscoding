package com.tianyongwei.algorithm.leetcode;

import java.util.Stack;

public class L0066PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int curr;
        Stack<Integer> stack = new Stack<>();
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if(digits.length - 1 == i) {
                curr = digits[i] + 1;
            } else {
                curr = digits[i] + carry;
            }
            stack.add(curr % 10);
            carry = curr / 10;
        }
        if(carry ==1) stack.add(carry);
        int[] res = new int[stack.size()];
        int idx = 0;
        while (!stack.empty()) {
            res[idx++] = stack.pop();
        }
        return res;
    }
}
