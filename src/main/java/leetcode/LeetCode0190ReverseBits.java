package leetcode;

public class LeetCode0190ReverseBits {
    public int reverseBits(int n) {
        String s = Integer.toString(n, 2);
        s = new StringBuilder(s).reverse().toString();
        Integer integer = Integer.valueOf(s, 10);
        return integer;
    }
}
