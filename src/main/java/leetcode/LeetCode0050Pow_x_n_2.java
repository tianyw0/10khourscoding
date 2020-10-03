package leetcode;

public class LeetCode0050Pow_x_n_2 {

    public double myPow(double x, int n) {
        if(n == 0) return 1;

        long num = n;
        if(num < 0) {
            x = 1 / x;
            num = -num;
        }
        // 快速幂
        double res = 1.0;
        while (num != 0) {
            if(num % 2 == 1) {
                res = res * x;
            }
            x = x * x;
            num = num / 2;
        }

        return res;
    }
}
