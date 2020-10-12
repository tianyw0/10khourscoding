package leetcode;

public class LeetCode0070ClimbingStairs {
    public int climbStairs(int n) {
        if(n == 1) {
            return 1;
        }

        if(n == 2) {
            return 2;
        }

        int first = 1, second = 2;
        for (int i = 3; i <= n-1; i++) {
            int tmp = first;
            first = second;
            second = tmp + second;
        }
        return first + second;
    }
}
