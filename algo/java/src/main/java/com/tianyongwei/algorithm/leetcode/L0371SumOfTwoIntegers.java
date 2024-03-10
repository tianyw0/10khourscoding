
//不使用运算符 + 和 - ，计算两整数 a 、b 之和。 
//
// 示例 1: 
//
// 输入: a = 1, b = 2
//输出: 3
// 
//
// 示例 2: 
//
// 输入: a = -2, b = 3
//输出: 1 
// Related Topics 位运算 
// 👍 321 👎 0


package com.tianyongwei.algorithm.leetcode;

public class L0371SumOfTwoIntegers {
    public int getSum(int a, int b) {
        // 本质上是考察加法器的制作
        int hi, lo;
        while(true) {
            lo = (a ^ b);
            hi = (a & b);
            if(hi == 0) {
                return lo;
            } else {
                hi = hi << 1;
                a = lo;
                b = hi;
            }
        }
    }
}

