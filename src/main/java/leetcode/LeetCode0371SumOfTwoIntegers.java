
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


package leetcode;

public class LeetCode0371SumOfTwoIntegers {
    public int getSum(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;

        int hi = (a & b) << 1;
        int lo = a ^ b;

        while (hi != 0) {
            int carry = (hi & lo) << 1;

        }
        return
    }
}

