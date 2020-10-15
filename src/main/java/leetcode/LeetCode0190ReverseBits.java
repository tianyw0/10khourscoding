package leetcode;

public class LeetCode0190ReverseBits {
    public int reverseBits(int n) {
        String unsigned = Integer.toUnsignedString(n, 2);
        String zeros = "0".repeat(32-unsigned.length());
        unsigned = zeros + unsigned;
        unsigned = new StringBuilder(unsigned).reverse().toString();
        return (int) Long.parseLong(unsigned, 2);
    }
}
