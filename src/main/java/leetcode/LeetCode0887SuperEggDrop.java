package leetcode;

public class LeetCode0887SuperEggDrop {
    public int superEggDrop(int K, int N) {
        // 鸡蛋只有一个的时候 需要尝试 N 次
        // 楼层只有一层的时候 需要尝试 0 次
        if(K == 1) return N;
        if(N == 1) return 0;

        int count = N;
        for (int i = 1; i <= K; i++) {
            count = Math.min(count, 1);
        }

        return 0;
    }
}
